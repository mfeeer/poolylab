package p119_Organismo;

public class Organismo {
    private String nombre;

    public Organismo (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void respiracion(){
        System.out.println("Respirandoooo................");
    }
    public void movimiento(){
        System.out.println("Moviendosee...................");
    }
    public void crecimiento(){
        System.out.println("Creciendoooo..................");
    }
}
