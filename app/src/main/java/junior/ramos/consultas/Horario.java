package junior.ramos.consultas;

public class Horario {

    public int id;
    public String hora;

    public Horario(String Hora){
    this.hora = hora;
    }

    public Horario(int id, String hora){
        this.id = id;
        this.hora = hora;
    }

    public String toString(){
        return "";
    }

    public String getHora() {
        return hora;
    }
}
