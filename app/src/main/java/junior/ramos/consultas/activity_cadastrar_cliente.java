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
    }

    public void salvar(View view){
        TextInputEditText entradaNomeCliente = findViewById(R.id.entradaNomeCliente); // captura o valor digitado na entrada de nome do cliente
        String nomeUsuario = Objects.requireNonNull(entradaNomeCliente.getText()).toString();// pega o valor digitado que é editable e transforma em um objeto do tipo String

        TextInputEditText entradaEnderecoCliente = findViewById(R.id.entradaEnderecoCliente);
        String enderecoCliente = entradaEnderecoCliente.getText().toString();

        TextInputEditText entradaTelefoneCliente = findViewById(R.id.entradaTelefoneCliente);
        int telefoneCliente = Integer.parseInt(entradaTelefoneCliente.getText().toString());

        TextInputEditText entradaNomePet = findViewById(R.id.entradaNomePet);
        String nomePet = Objects.requireNonNull(entradaNomePet.getText()).toString();

        TextInputEditText entradaIdadePet = findViewById(R.id.entradaIdadePet);
        int idadePet = Integer.parseInt(entradaIdadePet.getText().toString());
    }
}
