package junior.ramos.consultas;

public class Cadastro {
    Cliente cliente;

    public Cadastro(){}
    public Cadastro(Cliente cliente) {
        this.cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
