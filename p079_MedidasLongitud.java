/**
 * Diseña un programa con dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros a
pies. Deberá́ mostrar un menú́ con las opciones correspondientes.
 */
import java.util.Scanner;
public class p079_MedidasLongitud {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de conversión:");
            System.out.println("1. Convertir pulgadas a centímetros");
            System.out.println("2. Convertir metros a pies");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Introduce la cantidad en pulgadas: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = pulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros.");
                    break;
                case 2:
                    System.out.print("Introduce la cantidad en metros: ");
                    double metros = scanner.nextDouble();
                    double pies = metrosAPies(metros);
                    System.out.println(metros + " metros son " + pies + " pies.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while(opcion != 3);
    }

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }
}


