package p114_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripción;
    private double Salario;
    protected double Total;

    public Jugador (String nombre, char sexo, String descripcion, double salario){
        Nombre = nombre;
        Sexo = sexo;
        Descripción = descripcion;
        Salario = salario;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public abstract double getBono();



    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripción=" + Descripción + ", Salario=" + Salario
                + ", Total=" + Total + "]";
    }
    

    

}
