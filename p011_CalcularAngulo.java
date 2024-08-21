// Calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo
// angulo3 = 180 - (angulo1 + angulo2)

import java.util.Scanner;

public class p011_CalcularAngulo {
    public static void main (String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner angulo= new Scanner (System.in);
    System.out.println("\nCalculando el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo\n");
    System.out.println("Dame el primer ángulo: ");
    angulo1= angulo.nextDouble();
    System.out.println("Dame el segundo ángulo: ");
    angulo2= angulo.nextDouble();
    angulo3= 180 - (angulo1 + angulo2);
 
    System.out.println("\nEl tercer ángulo de un triángulo dados los dos primeros del mismo es: " + angulo3);    
    }

        

}
