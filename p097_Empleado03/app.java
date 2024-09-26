package p097_Empleado03;

public class app {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", 25);
        Empleado empleado2 = new Empleado("Nepomuseno", 1);
        Empleado empleado3 = new Empleado();

        empleado3.setNombre("Jorge");
        empleado3.setEdad(2);


        System.out.print("\033[H\033[2J");
        System.out.println("Empleado1:" + empleado1.toString());
        System.out.println("Empleado2:" + empleado2.toString());
        System.out.println("Empleado3:" + empleado3.toString());

        empleado2.setNombre("Anastacia");
        empleado2.setEdad(15);
        System.out.println("\nEmpleado 2 después de la transformación:" + empleado2.toString());
    }
}
