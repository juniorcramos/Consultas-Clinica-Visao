package junior.ramos.consultas;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Tipo {

    private int id;
    private String nome;


    public Tipo(String nome) {
        this.nome = nome;
    }
    public Tipo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void inserir(Context context, String nome){
        Banco banco = new Banco(context);
        SQLiteDatabase bd = banco.getReadableDatabase();

        bd.execSQL("INSERT INTO tipo (nome) VALUES ('"+nome+"')");
        bd.close();
    }

    public List<Tipo> getTipos(Context context){
        Banco banco = new Banco(context);
        SQLiteDatabase db = banco.getReadableDatabase();

        Cursor cursor = db.rawQuery( "SELECT id, nome FROM tipo ORDER BY nome", null );

        List<Tipo> lista = new ArrayList<>();

        if( cursor.getCount() > 0 ){
            cursor.moveToFirst();

            do{
                Tipo g = new Tipo(this.id, this.nome);
                g.setId(  cursor.getInt( 0 ) );
                g.setNome(  cursor.getString( 1 ) );
                lista.add( g );
            }while (cursor.moveToNext());
        }
        return lista;
    }
}
