/**
 * Diseña un programa con una función que reciba tres parámetros: dos números que corresponden a un rango (ini,
fin), otro número constante que es 3 o 4 regrese la suma de números múltiplos de 3 o múltiplos de 4 en el rango
de números especificados. Deberá́ mostrar un menú́ con las opciones correspondientes. La llamada a la función
podría ser:
• SumaMultiplos(10,20,3) – para la suma de los múltiplos de 3 entre 10 y 20
• SumaMultiplos(50,100,4) - para los múltiplos de 4 entre 50 y 100
Nota:
• Antes de llamar a la función deberá validar que el rango de números es válido (ini < fin).
 */
import java.util.Scanner;
public class p080_SumaMultiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de sumas de múltiplos:");
            System.out.println("1. Sumar múltiplos de 3 en un rango");
            System.out.println("2. Sumar múltiplos de 4 en un rango");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Introduce el valor inicial del rango: ");
                int ini = scanner.nextInt();
                System.out.print("Introduce el valor final del rango: ");
                int fin = scanner.nextInt();

                if (ini < fin) {
                    int constante = (opcion == 1) ? 3 : 4;
                    int suma = SumaMultiplos(ini, fin, constante);
                    System.out.println("La suma de los múltiplos de " + constante + " entre " + ini + " y " + fin + " es: " + suma);
                } else {
                    System.out.println("El rango no es válido. El valor inicial debe ser menor que el valor final.");
                }
            } else if (opcion != 3) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            
        } while(opcion != 3);
        
        System.out.println("Saliendo del programa...");
    }

    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        
        return suma;
    }
}
