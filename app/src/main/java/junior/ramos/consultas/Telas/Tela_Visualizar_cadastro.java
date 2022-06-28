package junior.ramos.consultas.Telas;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import junior.ramos.consultas.Adapter.MyAdapter;
import junior.ramos.consultas.ClassesComuns.Cliente;
import junior.ramos.consultas.R;

public class Tela_Visualizar_cadastro extends AppCompatActivity {

    //Button btnAdicionar;
    DatabaseReference database;
    RecyclerView recyclerView;
    MyAdapter myadapter;
    ArrayList<Cliente> list;
    List<String> clientes = new ArrayList<>();
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_cadastro);

        recyclerView = findViewById(R.id.recyclerViewClientes);
        database = FirebaseDatabase.getInstance().getReference("Cadastro");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        myadapter = new MyAdapter(this, list);
        recyclerView.setAdapter(myadapter);
        cliente = new Cliente();

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.i("Firebase", snapshot.getValue().toString());

                for (DataSnapshot child : snapshot.getChildren()) {
                    cliente = snapshot.getValue(Cliente.class);
                    list.add(cliente);
                }
                myadapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //Log.i("FIREBASE", "erro relacionado ao banco de dados" + error);
            }
        });
    }
}