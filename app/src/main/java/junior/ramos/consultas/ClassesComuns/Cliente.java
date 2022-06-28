package junior.ramos.consultas.ClassesComuns;

public class Cliente {

    private String nomeCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private String nomePet;
    private String idadePet;
    //private CheckBox sms, telefone, email;

    public Cliente(){}
    public Cliente(String nomeCliente, String enderecoCliente, String telefoneCliente, String nomePet, String idadePet){
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.nomePet = nomePet;
        this.idadePet = idadePet;
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
    public String getIdadePet() {
        return idadePet;
    }

    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    public void setIdadePet(String idadePet) {
        this.idadePet = idadePet;
    }

    public String toString(){
        return "Nome Cliente: "+getNomeCliente() + "/nEndereço: "+ getEnderecoCliente() + "/nTelefone: "+ getTelefoneCliente();
    }
}
