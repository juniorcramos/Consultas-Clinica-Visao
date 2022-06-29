package junior.ramos.consultas.Telas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;

import junior.ramos.consultas.Adapter.MyAdapter;
import junior.ramos.consultas.ClassesComuns.Cliente;
import junior.ramos.consultas.R;

public class Tela_Visualizar_cadastro extends AppCompatActivity {

    //Button btnAdicionar;
    DatabaseReference database;
    private RecyclerView recyclerView;
    //MyAdapter myadapter;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_cadastro);

        recyclerView = findViewById(R.id.recyclerViewClientes);
        //Configurar o adapter
        MyAdapter adapter = new MyAdapter();

        //Configurando o recycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);


    }
}