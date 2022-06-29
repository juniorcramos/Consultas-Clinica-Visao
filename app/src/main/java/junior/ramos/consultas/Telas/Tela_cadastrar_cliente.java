package junior.ramos.consultas.Telas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import junior.ramos.consultas.ClassesComuns.Cliente;
import junior.ramos.consultas.R;
public class Tela_cadastrar_cliente extends Activity {

    Spinner spTipos;
    private TextInputEditText entradaNomeCliente;
    private TextInputEditText entradaEnderecoCliente;
    private TextInputEditText entradaTelefoneCliente;
    private TextInputEditText entradaNomePet;
    private TextInputEditText entradaIdadePet;
    private RadioGroup planos;
    private CheckBox checkBoxSms;
    private CheckBox checkBoxTelefone;
    private CheckBox checkBoxEmail;
    private DatabaseReference referenciaBanco = FirebaseDatabase.getInstance().getReference();// referencia a raiz do banco de dados, permite salvar dados no firebase.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        spTipos = (Spinner) findViewById(R.id.spinnerTiposPet);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.selecionarTipoAnimal, android.R.layout.simple_list_item_1);//Passa o array para o speaner
        spTipos.setAdapter(adapter);

        entradaNomeCliente = findViewById(R.id.entradaNomeCliente); // captura o valor digitado na entrada de nome do cliente
        entradaEnderecoCliente = findViewById(R.id.entradaEnderecoCliente);
        entradaTelefoneCliente = findViewById(R.id.entradaTelefoneCliente);
        entradaNomePet = findViewById(R.id.entradaNomePet);
        entradaIdadePet = findViewById(R.id.entradaIdadePet);
        planos = findViewById(R.id.btPlano_Convenio);

        checkBoxSms = findViewById(R.id.checkBoxSms);
        checkBoxTelefone = findViewById(R.id.checkBoxTelefone);
        checkBoxEmail = findViewById(R.id.checkBoxEmail);

    }
    public void checkBoxes(){
        boolean checkSms = checkBoxSms.isChecked();
        boolean checkTelefone = checkBoxTelefone.isChecked();
        boolean checkEmail = checkBoxEmail.isChecked();
    }

    public void salvarCadastro(View view){
        DatabaseReference clientes = referenciaBanco.child("Clientes");// Cria o banco com o nome de Cadastro no Firebase
        Cliente cliente = new Cliente();

        cliente.setNomeCliente(entradaNomeCliente.getText().toString());// pega o valor digitado que é editable e transforma em um objeto do tipo String
        cliente.setEnderecoCliente(entradaEnderecoCliente.getText().toString());
        cliente.setTelefoneCliente(entradaTelefoneCliente.getText().toString());
        cliente.setNomePet(entradaNomePet.getText().toString());
        cliente.setIdadePet(entradaIdadePet.getText().toString());

        clientes.push().setValue(cliente);

    }

    public void limpar(View view){
        entradaNomeCliente.setText("");
        entradaEnderecoCliente.setText("");
        entradaTelefoneCliente.setText("");
        entradaNomePet.setText("");
        entradaIdadePet.setText("");
    }
}