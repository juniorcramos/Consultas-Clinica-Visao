package junior.ramos.consultas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    private static final int VERSAO = 1;
    private static final String NOME = "Clinica";

    public Banco(Context context){super(context, NOME, null, VERSAO);}

    @Override
    public void onCreate(SQLiteDatabase banco) {
    banco.execSQL("CREATE TABLE IF NOT EXISTS nome ("+" id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "+" nome);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
