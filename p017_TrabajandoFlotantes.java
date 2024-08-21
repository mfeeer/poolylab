/**
 * p017_TrabajandoFlotantes - Trabajando con números y literales de tipo flotante
 */

public class p017_TrabajandoFlotantes {
   public static void main(String[] args) {
            float num1 = 423.45f;//la f indica el tipo de numero que es (float)
            float num2 = 123f;
            float num3 = 1.94e-8f;
            double num4 = 1232312321.434343d;//la d indica el tipo de numero que es (double)
            double num5 = .3456;
            System.out.print("\033[H\033[2J"); System.out.flush();//\033[H\033[2J es un escape ANSI que mueve el cursor al inicio y limpia la pantalla y System.out.flush() asegura que el comando de limpieza se ejecute inmediatamente
            System.out.println("\nUso de String.format para formateo de números flotantes. : ");//String.format para formatear numeros y alinearlos con cierta cantidad de decimales
            System.out.println(String.format("num1 y num2 en formato flotante : %f %f",num1,num2));
            System.out.println(String.format("num1 y num2 en formato flotante con decimales : %.2f %.3f",num1,num2));
            System.out.println(String.format("num1 alineado en formato flotante alineado : %10.2f",num1));
            System.out.println(String.format("num1 alineado en formato flotante alineado : %10.2f",num2));//el 10 antes del punto indica cuantos espacios se dejarán
            System.out.println(String.format("num3 en formato exponencial : %e",num3));
            System.out.println(String.format("num3 en formato exponencial cifras : %.3e",num3));
            System.out.println(String.format("num 4 con separador de miles y decimales : %,.2f", num4)); //%,.2f incluye separadores de miles y muestra 2 decimales
            System.out.println(String.format("num 5 en formato flotante : %f", num5));
            System.out.println("\nUso de System.out.prinf para dar formato a números flotantes: ");
            System.out.printf("num1, num2 en formato floante : %f %f \n", num1,num2);
            System.out.printf("num3, num4 en formato flotante con decimales. : %.2f %.2f \n", num3,num4);
            System.out.printf("num4, num5 en formato exponencial : %e %e \n", num4,num5);
            System.out.printf("num4, num5 en formato exponencial con decimales : %.2e %.2e \n", num4,num5);
            System.out.println("\nUso MIN_VALUE y MAX_VALUE conocer los rangos de los números flotantes: ");
            System.out.println(String.format("\nTipo: float Min: %f Max: %f",Float.MIN_VALUE, Float.MAX_VALUE));
            System.out.println(String.format("\nTipo: double Min: %f Max: %f",Double.MIN_VALUE, Double.MAX_VALUE));//Float.MIN_VALUE y Double.MIN_VALUE muestran los valores mínimos positivos representables para float y double. Float.MAX_VALUE y Double.MAX_VALUE los valores maximos.
   } 
}
