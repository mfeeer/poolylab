package p114_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
   private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador (String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos){
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;

    
    }

    public int getSubordinados() {
        return Subordinados;
    }

    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }

    public int getProyectos() {
        return Proyectos;
    }

    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }
    public double getBono() {
        int Bono = 0;
        int Salario = 0;
         double Total = Salario + Bono;
         return Bono = (int) ((Salario * 0.15) + (Proyectos * 100) + (Subordinados * 10));
    }

    @Override
    public String toString() {
        return "JugadorEntrenador ["+ super.toString() + ", Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + "]";
    }

   
    
    
}
