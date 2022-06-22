package junior.ramos.consultas;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Objects;

public class activity_cadastrar_cliente extends Activity {

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
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.selecionarTipoAnimal, android.R.layout.simple_list_item_1);//Passa o array para o speaner
        spTipos.setAdapter(adapter);

        entradaNomeCliente = findViewById(R.id.entradaNomeCliente); // captura o valor digitado na entrada de nome do cliente
        entradaEnderecoCliente = findViewById(R.id.entradaEnderecoCliente);
        entradaTelefoneCliente = findViewById(R.id.entradaTelefoneCliente);
        entradaNomePet = findViewById(R.id.entradaNomePet);
        entradaIdadePet = findViewById(R.id.entradaIdadePet);
    }

    public void salvarCadastro(View view){

        String nomeUsuario = Objects.requireNonNull(entradaNomeCliente.getText()).toString();// pega o valor digitado que é editable e transforma em um objeto do tipo String
        String enderecoCliente = entradaEnderecoCliente.getText().toString();
        int telefoneCliente = Integer.parseInt(entradaTelefoneCliente.getText().toString());
        String nomePet = Objects.requireNonNull(entradaNomePet.getText()).toString();
        int idadePet = Integer.parseInt(entradaIdadePet.getText().toString());
    }

    public void limpar(View view){
        entradaNomeCliente.setText("");
        entradaEnderecoCliente.setText("");
        entradaTelefoneCliente.setText("");
        entradaNomePet.setText("");
        entradaIdadePet.setText("");
    }


}
