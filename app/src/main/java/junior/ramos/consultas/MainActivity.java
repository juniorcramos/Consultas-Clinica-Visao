package junior.ramos.consultas;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btCadastrarCliente, btVisualizarCadastros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a iteração de clicar no botão e ir para a proxima tela
        btCadastrarCliente = findViewById(R.id.btCadastrarCliente);
        btVisualizarCadastros = findViewById(R.id.btVisualizarCadastros);

        //código para clicar no botão "cadastrar cliente" na tela principal e ir para a tela de cadastrar cliente
        btCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activity_cadastrar_cliente.class);
                startActivity(intent);
            }
        });
        //código para clicar no botão "visualizar cadastros" na tela principal e ir para a tela de visualizar cadastros
        btVisualizarCadastros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activity_Visualizar_cadastro.class);
                startActivity(intent);
            }
        });
    }
}