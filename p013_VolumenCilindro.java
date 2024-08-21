// Calcular el volumen de un cilindro dado su radio y altura
// volumen = PI * (radio * radio) * altura

import java.util.Scanner;

public class p013_VolumenCilindro {
    public static void main (String[] args) {
        double radio, altura, volumen;
        Scanner vol= new Scanner (System.in);
    System.out.println("\nCalculando el volumen del cilindro dado su radio y altura\n");
    System.out.println("Dame su radio: "); radio= vol.nextDouble();
    System.out.println("Dame su altura: "); altura= vol.nextDouble();
    volumen= Math.PI * (radio * radio) * altura;
 
    System.out.println("\nEl volumenros del cilindro es: " + volumen);    
    }
}
