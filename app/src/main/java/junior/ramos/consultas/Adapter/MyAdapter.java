package junior.ramos.consultas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import junior.ramos.consultas.ClassesComuns.Cliente;
import junior.ramos.consultas.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<Cliente> lista;

    public MyAdapter(Context context, ArrayList<Cliente> lista){
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itens,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Cliente cliente = lista.get(position);
        //holder.nomeCliente.setText(cliente.getNomeCliente());
        //holder.endereco.setText(cliente.getEnderecoCliente());
        //holder.telefone.setText(cliente.getTelefoneCliente());
        //holder.nomePet.setText(cliente.getNomePet());
        //holder.idadePet.setText(cliente.getIdadePet());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nomeCliente, endereco, telefone, nomePet, idadePet;

        public ViewHolder(View itemView) {
            super(itemView);
            nomeCliente = itemView.findViewById(R.id.textViewNomeCliente);
            endereco = itemView.findViewById(R.id.textViewEndereco);
            telefone = itemView.findViewById(R.id.textViewTelefone);
            nomePet = itemView.findViewById(R.id.textViewNomePet);
            idadePet = itemView.findViewById(R.id.textViewIdade);
        }
    }
}
