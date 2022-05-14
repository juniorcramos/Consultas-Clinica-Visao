package junior.ramos.consultas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button cadastrarCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a iteração de clicar no botão e ir para a proxima tela
        cadastrarCliente = findViewById(R.id.buttonCadastrarCliente);
        cadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CadastroCliente.class);
                startActivity(intent);
            }
        });
    }
}