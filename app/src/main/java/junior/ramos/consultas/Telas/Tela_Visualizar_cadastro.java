package junior.ramos.consultas.Telas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
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
    DatabaseReference database = FirebaseDatabase.getInstance().getReference("Clientes");
    private DatabaseReference meusClientes = database.child("Clientes");
    private RecyclerView recyclerView;
    private List<Cliente> listaClientes = new ArrayList<>();
    ChildEventListener childEventListener;
    MyAdapter myadapter;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_cadastro);

        recyclerView = findViewById(R.id.recyclerViewClientes);
        //this.criarClientes();
        //Configurar o adapter
        MyAdapter adapter = new MyAdapter(listaClientes);

        //Configurando o recycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        myadapter = new MyAdapter(listaClientes);
        recyclerView.setAdapter(myadapter);
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Cliente cliente = dataSnapshot.getValue(Cliente.class);
                    listaClientes.add(cliente);
                }
                myadapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

}