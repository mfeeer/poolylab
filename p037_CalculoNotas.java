/**
 * p037_CalculoNotas - Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir
un mensaje de acuerdo con el promedio obtenido:
 */
import java.util.Scanner;
public class p037_CalculoNotas {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double suma = 0;
        double calificacion;
        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla

        System.out.print("Introduce la calificación 1: ");
        suma += obj.nextDouble();

        System.out.print("Introduce la calificación 2: ");
        suma += obj.nextDouble();

        System.out.print("Introduce la calificación 3: ");
        suma += obj.nextDouble();

        System.out.print("Introduce la calificación 4: ");
        suma += obj.nextDouble();

        System.out.print("Introduce la calificación 5: ");
        suma += obj.nextDouble();

        double promedio = suma / 5;

        System.out.println("Tu promedio es: " + promedio);
        if (promedio <= 6) {
            System.out.println("Quedas reprobado:(");
        } else if (promedio <= 7) {
            System.out.println("Pasas de panzazo :)");
        } else if (promedio <= 8) {
            System.out.println("Muy bien, puedes mejorar;) ");
        } else if (promedio <= 9) {
            System.out.println("Excelente, sigue así!!!!");
        } else if (promedio <= 10) {
            System.out.println("¡Perfecto, tu esfuerzo valió la pena!");
        } else {
            System.out.println("Error, las calis deben estar entre 0 y 10");
        }
        System.out.println("FIN DEL PROGRAMA...");
        
    }
}
