/**
 * p038_AceptarEstudianteV2 - Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La
Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.
 */

import java.util.Scanner;

public class p038_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre;
        char sexo;
        int edad;
        double cal1, cal2, cal3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.print("Ingresa el nombre del estudiante: ");
        nombre = obj.nextLine();

        System.out.print("Introduce el sexo del estudiante (h/m): ");
        sexo = obj.next().toLowerCase().charAt(0);

        System.out.print("Introduce la edad: ");
        edad = obj.nextInt();
        
        System.out.print("Introduce calificación 1: ");
        cal1 = obj.nextDouble();

        System.out.print("Introduce calificación 2: ");
        cal2 = obj.nextDouble();

        System.out.print("Introduce calificación 3: ");
        cal3 = obj.nextDouble();

        double promedio = (cal1 + cal2 + cal3) / 3;
        System.out.println("\nDatos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + (sexo == 'm' ? "Mujer" : "Hombre"));
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5) {
            System.out.println("Fuiste aceptado en la Universidad Kitty Kat SA!!!!");
        } else {
            System.out.println("No fuiste aceptado:(((");
        }

        System.out.println("FIN DEL PROGRAMA...");

    }
}
