package junior.ramos.consultas;
import android.content.DialogInterface;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class activity_cadastrar_cliente extends AppCompatActivity {

    Spinner spTipos;
    private TextInputEditText entradaNomeCliente;
    private TextInputEditText entradaEnderecoCliente;
    private TextInputEditText entradaTelefoneCliente;
    private TextInputEditText entradaNomePet;
    private TextInputEditText entradaIdadePet;

    private CheckBox checkBoxsms, checkBoxTelefone, checkBoxEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        // Entradas de dados por TextInputEditText
        entradaNomeCliente = findViewById(R.id.entradaNomeCliente);
        entradaEnderecoCliente = findViewById(R.id.entradaEnderecoCliente);
        entradaTelefoneCliente = findViewById(R.id.entradaTelefoneCliente);
        entradaNomePet = findViewById(R.id.entradaNomePet);
        entradaIdadePet = findViewById(R.id.entradaIdadePet);

        //CheckBox
        checkBoxsms = findViewById(R.id.checkBoxSms);
        checkBoxTelefone = findViewById(R.id.checkBoxTelefone);
        checkBoxEmail = findViewById(R.id.checkBoxEmail);
    }

    public void checkBoxTermo(){ //Verifica quais itens estão selecionados
        boolean smsAtivado = checkBoxsms.isChecked(); // método que verifica se está marcado, se estiver, returna true.
        boolean telefoneAtivado = checkBoxTelefone.isChecked();
        boolean emailAtivado = checkBoxEmail.isChecked();
    }
    public void Cadastrar(){

        checkBoxTermo();
        String nomeCliente = entradaNomeCliente.getText().toString();
        String enderecoCliente = entradaEnderecoCliente.getText().toString();
        String telefoneCliente = entradaTelefoneCliente.getText().toString();
        String nomePet = entradaNomePet.getText().toString();
        int idadePet = entradaIdadePet.getTextAlignment();
    }

}