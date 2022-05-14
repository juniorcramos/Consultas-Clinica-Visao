package junior.ramos.consultas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Button btCadastrarCliente,btVisualizarCadastros;
    private Spinner spTipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a iteração de clicar no botão e ir para a proxima tela
        btCadastrarCliente = findViewById(R.id.btCadastrarCliente);
        btVisualizarCadastros = findViewById(R.id.btVisualizarCadastros);

        btCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activity_cadastrar_cliente.class);
                startActivity(intent);
            }
        });

        btVisualizarCadastros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activity_Visualizar_cadastro.class);
                startActivity(intent);
            }
        });
    }

}