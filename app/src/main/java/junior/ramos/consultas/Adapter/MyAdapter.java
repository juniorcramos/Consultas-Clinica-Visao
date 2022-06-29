package junior.ramos.consultas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import junior.ramos.consultas.ClassesComuns.Cliente;
import junior.ramos.consultas.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Cliente> listaClientes;

    public MyAdapter(List<Cliente> lista){
        this.listaClientes = lista;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nomeCliente;
        TextView endereco;
        TextView telefone;
        TextView nomePet;
        TextView idadePet;

        public MyViewHolder(View itemView){
            super(itemView);
            nomeCliente = (TextView) itemView.findViewById(R.id.textViewNomeCliente);
            endereco = (TextView) itemView.findViewById(R.id.textViewEndereco);
            telefone = (TextView) itemView.findViewById(R.id.textViewTelefone);
            nomePet = (TextView) itemView.findViewById(R.id.textViewNomePet);
            idadePet = (TextView) itemView.findViewById(R.id.textViewIdade);
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
        Cliente cliente = listaClientes.get(position);
        holder.nomeCliente.setText(cliente.getNomeCliente());
        holder.endereco.setText(cliente.getEnderecoCliente());
        holder.telefone.setText(cliente.getTelefoneCliente());
        holder.nomePet.setText(cliente.getNomePet());
        holder.idadePet.setText(cliente.getIdadePet());
    }

    @Override
    public int getItemCount() {
        return listaClientes.size();
    }
}