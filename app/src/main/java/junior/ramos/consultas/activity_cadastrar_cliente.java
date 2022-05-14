package junior.ramos.consultas;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class activity_cadastrar_cliente extends AppCompatActivity {

    private Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);
    }

    private void carregarTipo(){
        Tipo tipo = new Tipo(0,"Selecione o Tipo");

    }

    private void cadastrarTipo(){


    }
}