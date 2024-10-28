import java.util.Scanner;

public class p122_Excepcion2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        
        try { //Aquí se pone el código que puede generar el error
            System.out.println("Dame un número:  ");
            int val = new Scanner(System.in).nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es:  " + val);
            
        } catch (Exception e) { // Aquí atrapamos el error (excepcion)y mandamos un mensaje personalizado
            System.out.println("Debes introducir un númeroo!!!!");
        }
        System.out.println("La vida sigue");
    }
}
