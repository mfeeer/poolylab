// Calcular la hipotenusa de un triángulo rectangulo
// Hipotenusa = raizcuadrada( longitudLado1 * longitudLado1 + logitudLado2 * longitudLado2 )

import java.util.Scanner;
public class p010_HipotenusaTriangulo { 
public static void main (String[] args) { 
    double longitudLado1, longitudLado2, hipotenusa;
    Scanner lhipotenusa = new Scanner (System.in);
    System.out.println("\nCalculando la hipotenusa de un triángulo rectángulo\n");
    System.out.println("Dame la longitud del lado 1: ");
    longitudLado1= lhipotenusa.nextDouble();
    System.out.println("Dame la longitud del lado 2: ");
    longitudLado2= lhipotenusa.nextDouble();
    hipotenusa = Math.sqrt(Math.pow(longitudLado1, 2)+ Math.pow(longitudLado2,2));

    System.out.println("\nLa hipotenusa del triángulo rectángulo es:  " + hipotenusa);    
    }
}

