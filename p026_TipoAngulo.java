/**
 * p026_TipoAnguelo - Determina el tipo de angulo en base a su longitud
 * >90 agudo, = 90 recto,> 90 y < 180 obtuso, = 180 llano, > 180 y < 360 concavo
 */
import java.util.Scanner;

public class p026_TipoAngulo {
    System.out.print("\033[H\033[2J"); System.out.flush();
    System.out.println("Muestra el tipo de ángulo \n");
    System.out.print("Dame un ángulo entre 0 y 360 grados? ");
    int angulo = new Scanner(System.in).nextInt();
    System.out.print("El ángulo que introdujiste: ");
    if(angulo<90)
    
    System.out.println("Es agudo");
    
    if(angulo==90)
    
    System.out.println("Es recto");
    
    if(angulo>90 && angulo<180)
    
    System.out.println("Es obtuso");
    
    if(angulo==180)
    
    System.out.println("Es llano");
    
    if(angulo>180 && angulo<360)
    
    System.out.println("Es concavo");
    
    if(angulo==360)
    System.out.println("Es completo");
    System.out.println("\nProceso terminado ....");
}