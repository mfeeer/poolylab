/**
 * p035_ContinentesMundo - Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África,
3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango especificado, mostrar
un mensaje de error
 */
import java.util.Scanner;
public class p035_ContinentesMundo {
    public static void main(String[] args) {
        char cont;
        int imp = 0;
       
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        
        System.out.println("Opciones: ");
        System.out.println("Continente [A1]sia - 1:");
        System.out.println("Continente [A2]frica - 2:");
        System.out.println("Continente [A3]mérica del Norte - 3:");
        System.out.println("Continente [A4]mérica del Sur - 4:");
        System.out.println("Continente [A5]ntártida - 5:");
        System.out.println("Continente [E]uropa - 6:");
        System.out.print("Elige una opción:");
        cont = Character.toUpperCase (obj.next().charAt(0));

        switch (cont){
            case '1': imp = 1; break;
            case '2': imp = 2; break;
            case '3': imp = 3; break;
            case '4': imp = 4; break;
            case '5': imp = 5; break;
            case '6': imp = 6; break;
            default:
            System.out.println("Opción no válida.");
                break;
        
        }
        switch (imp) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("África");
                break;
            case 3:
                System.out.println("América del Norte");
                break;
            case 4:
                System.out.println("América del Sur");
                break;
            case 5:
                System.out.println("Antártida");
                break;
            case 6:
                System.out.println("Europa");
                break;
        }
        System.out.printf("Gracias por usar este programa :)");
    }

}