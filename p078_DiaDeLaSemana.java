/**
 * p078_NumeroMayor - Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con
letra. Deberá validar que el número está en el rango adecuado.
 */

 import java.util.Scanner;

public class p078_DiaDeLaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número entre 1 y 7:");
        int numero = scanner.nextInt();
        
        String dia = obtenerDiaDeLaSemana(numero);
        
        if (dia != null) {
            System.out.println("El día de la semana es: " + dia);
        } else {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 7.");
        }
    }
    
    public static String obtenerDiaDeLaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return null;  // Retorna null si el número no está en el rango
        }
    }
}


