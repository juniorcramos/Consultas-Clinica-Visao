package junior.ramos.consultas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import junior.ramos.consultas.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nomeCliente;
        TextView endereco;
        TextView telefone;
        TextView nomePet;
        TextView idadePet;

        public MyViewHolder(View itemView){
            super(itemView);
            nomeCliente = itemView.findViewById(R.id.textViewNomeCliente);
            endereco = itemView.findViewById(R.id.textViewEndereco);
            telefone = itemView.findViewById(R.id.textViewTelefone);
            nomePet = itemView.findViewById(R.id.textViewNomePet);
            idadePet = itemView.findViewById(R.id.textViewIdade);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.itens,parent, false);
        return  new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nomeCliente.setText("Nome João");
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}