package junior.ramos.consultas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button agendarConsulta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a iteração de clicar no botão e ir para a proxima tela
        agendarConsulta = findViewById(R.id.buttonAdicionarConsulta);
        agendarConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AgendarConsulta.class);
                startActivity(intent);
            }
        });
    }
}