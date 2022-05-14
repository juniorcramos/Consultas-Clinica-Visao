package junior.ramos.consultas;

import java.lang.reflect.Array;

public class Especie {

    private int id;
    private String nome;

    public Especie() {
    }

    public Especie(String nome) {
        this.nome = nome;
    }
    public Especie(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
