/**
 * p041_ProcesaCalificaciones
 */
import java.util.Scanner;
public class p041_ProcesaCalificaciones {
    public static void main (String[] args) {
        int n, c;
        float cal, suma=0, prom=0;
        Scanner obj = new Scanner (System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.println("Calcular la suma y el promedio de n calificaxiones \n");
        System.out.print("¿Cuántas calificaciones?"); n = obj.nextInt();

        c = 1;
        while (c<=n)  {
            System.out.printf("Calificación %d = ", c);
            cal = obj.nextFloat();
            suma = suma + cal;
            c++;
        }
        prom = suma / n;
        System.out.printf("La suma es:   ");
    }
}  
