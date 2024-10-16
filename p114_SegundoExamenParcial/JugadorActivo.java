package p114_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo (String nombre, char sexo, String descripcion, double salario, int partidos, int goles){
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }

    public int getPartidos() {
        return Partidos;
    }

    public void setPartidos(int partidos) {
        Partidos = partidos;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int goles) {
        Goles = goles;
    }
    public double getBono() {
        int Bono = 0;
        int Salario = 0;
        double Total = Salario + Bono;
        return Bono = (int) ((Salario * 0.10) + (Partidos * 50) + (Goles * 5));
    }

    public String toString() {
        return "JugadorActivo ["+ super.toString() + ", Partidos=" + Partidos + ", Goles=" + Goles + "]";
    }

    
}
