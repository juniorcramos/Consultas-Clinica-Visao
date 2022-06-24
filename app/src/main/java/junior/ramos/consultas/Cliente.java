package junior.ramos.consultas;

public class Cliente {

    private String nomeCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private String nomePet;
    private int idadePet;

    public Cliente(String nome, String endereco, String telefone, String nomePet, int idadePet){
        this.nomeCliente = nome;
        this.enderecoCliente = endereco;
        this.telefoneCliente = telefone;
        this.nomePet = nomePet;
        this.idadePet = idadePet;
    }
    public Cliente(){}
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public int getIdadePet() {
        return idadePet;
    }

    public void setIdadePet(int idadePet) {
        this.idadePet = idadePet;
    }

    public String toString(){
        return "Nome Cliente: "+getNomeCliente() + "/nEndereço: "+ getEnderecoCliente() + "/nTelefone: "+ getTelefoneCliente();
    }
}
