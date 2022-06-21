package junior.ramos.consultas;
import android.content.DialogInterface;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class activity_cadastrar_cliente extends AppCompatActivity {

    Spinner spTipos;
    private TextInputEditText entradaNomeCliente;
    private TextInputEditText entradaEnderecoCliente;
    private TextInputEditText entradaTelefoneCliente;
    private TextInputEditText entradaNomePet;
    private TextInputEditText entradaIdadePet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        //Inclusão dos códigos para exibir a lista de tipos de pets no Speaner.
        spTipos = (Spinner) findViewById(R.id.spinnerTiposPet);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.selecionarTipoAnimal, android.R.layout.simple_spinner_item);//Passa o array para o speaner
        spTipos.setAdapter(adapter);
    }


}