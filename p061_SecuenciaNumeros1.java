/**
 * p061_SecuenciaNumeros1 - programa 58 valor de la i o de la j
 * el 63 es como e 60 en lugar de poner el factorial es ponerr el numero como tal 

 */
import java.util.Scanner;
public class p061_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿De cuántos renglones deseas la pirámide? "); int r = obj.nextInt();
        
        for (int i= 1; i<= r; i++) {  
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            

            System.out.println();

        }
        obj.close();
    }   
}


