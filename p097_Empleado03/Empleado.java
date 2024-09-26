package p097_Empleado03;

public class Empleado {
    //propiedades
    private String Nombre;
    private int Edad;

    //constructor
    public Empleado() {};
    public Empleado(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }
    

    //metodos
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + "]";
    }
    
     
}
