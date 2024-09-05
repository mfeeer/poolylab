/**
 * p063_SumaTerminos1 - Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma
 */
import java.util.Scanner;
public class p063_SumaTerminos1 {
    public static void main (String[] args ){
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("¿Cúantos términos desea imprimir? ");
        int n = new Scanner (System.in).nextInt();
        
        float s = 0;
        
        System.out.println("Salida:");
        for (int i = 1; i <= n; i++) {
            float f = 1.0f / i;
            s += f;


            if (i==1){
                System.out.print("1");
            } else {
                System.out.print(" + 1/" + i);
            }
        

        }
        
        System.out.printf("\nSuma total: %.15f", s); 
    }
}
