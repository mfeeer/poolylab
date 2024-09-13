/**
 * p068_ConversionConversion - Convierte de grados Falsius a Farenheit y viceversa usando funciones 
 */

import java.util.Scanner;
public class p068_ConversionTemperatura {
    public static float CaF(float temp) {
        return (temp = 9.0f / 5.0f) + 32;
    }
    public static float FaC(float temp){
        return (temp - 32) + 5.0f / 9.0f;
    }
    public static void main (String [] args){
        int op;
        float temp;
        Scanner obj = new Scanner (System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("Conversion de Temperatura");
            System.out.println("1, C a F\n2, F a C\n3, Salir");
            System.out.println("Elige: "); op = obj.nextInt();

            switch (op){
                case 1:
                    System.out.println("Convierte de C a F");
                    System.out.println("Dame la temperatura: "); temp = obj.nextFloat();
                    System.out.println("El resultado es: "  + CaF(temp)); 
                    break;

                case 2: 
                    System.out.println("Convierte de F a C");
                    System.out.println("Dame la temperatura: "); temp = obj.nextFloat();
                    System.out.println("El resultado es: "  + FaC(temp)); 
                    break;

                case 3:
                    System.out.println("\nGracias por utilizar este programa"); break;
                default:
                    break;

            }
            System.out.println("Presiona cualquier tecla para continuar"); obj.nextInt(); obj.nextLine();
                

        } while (op!= 3);
        System.out.println("Programa terminado");
                
    }
}
