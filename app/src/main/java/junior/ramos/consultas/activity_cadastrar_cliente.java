package junior.ramos.consultas;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class activity_cadastrar_cliente extends Activity {

    Spinner spTipos;
    private TextInputEditText entradaNomeCliente;
    private TextInputEditText entradaEnderecoCliente;
    private TextInputEditText entradaTelefoneCliente;
    private TextInputEditText entradaNomePet;
    private TextInputEditText entradaIdadePet;
    private CheckBox checkBoxSms, checkBoxTelefone, checkBoxEmail;
    private DatabaseReference referenciaBancoDeDados = FirebaseDatabase.getInstance().getReference();// referencia a raiz do banco de dados, permite salvar dados no firebase.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        //Inclusão dos códigos para exibir a lista de tipos de pets no Speaner.
        spTipos = (Spinner) findViewById(R.id.spinnerTiposPet);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.selecionarTipoAnimal, android.R.layout.simple_list_item_1);//Passa o array para o speaner
        spTipos.setAdapter(adapter);

        entradaNomeCliente = findViewById(R.id.entradaNomeCliente); // captura o valor digitado na entrada de nome do cliente
        entradaEnderecoCliente = findViewById(R.id.entradaEnderecoCliente);
        entradaTelefoneCliente = findViewById(R.id.entradaTelefoneCliente);
        entradaNomePet = findViewById(R.id.entradaNomePet);
        entradaIdadePet = findViewById(R.id.entradaIdadePet);

        //checkbox
        checkBoxSms = findViewById(R.id.checkBoxSms);
        checkBoxTelefone = findViewById(R.id.checkBoxTelefone);
        checkBoxEmail = findViewById(R.id.checkBoxEmail);

        //firebase
       //
    }
    public void checkBoxes(){
        boolean checkSms = checkBoxSms.isChecked();
        boolean checkTelefone = checkBoxTelefone.isChecked();
        boolean checkEmail = checkBoxEmail.isChecked();
    }

    public void salvarCadastro(View view){
        DatabaseReference clientes = referenciaBancoDeDados.child("Cadastro");// Cria o banco com o nome de Cadastro no Firebase
        Cliente cliente = new Cliente();
        Cadastro cadastro = new Cadastro(cliente);//Cria um objeto do tipo cadastro com as informações do cliente e de seu pet

        //checkBoxes();
        cadastro.cliente.setNomeCliente(entradaNomeCliente.getText().toString());// pega o valor digitado que é editable e transforma em um objeto do tipo String
        cadastro.cliente.setEnderecoCliente(entradaEnderecoCliente.getText().toString());
        cadastro.cliente.setTelefoneCliente(entradaTelefoneCliente.getText().toString());
        cadastro.cliente.setNomePet(entradaNomePet.getText().toString());
        int idadePet =  Integer.parseInt (entradaIdadePet.getText().toString());
        cadastro.cliente.setIdadePet(idadePet);

        clientes.child(cadastro.cliente.getNomeCliente()).setValue(cadastro);
    }

    public void limpar(View view){
        entradaNomeCliente.setText("");
        entradaEnderecoCliente.setText("");
        entradaTelefoneCliente.setText("");
        entradaNomePet.setText("");
        entradaIdadePet.setText("");
    }
}