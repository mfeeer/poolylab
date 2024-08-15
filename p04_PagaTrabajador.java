//p04_PagaTrabajador - Calcula la paga de un trabajador

import java.util.Scanner;
public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagaBruta, paganeta;
        Scanner obj = new Scanner (System.in);

        System.out.print("\nCalculando la paga de un trabajador\n");
        //Entrada
        System.out.print("Nombre del Trabajador : "); nombre = obj.nextLine();
        System.out.print("Horas trabajadas : "); horas = obj.nextInt();
        System.out.print("Paga por hora : "); paga = obj.nextFloat();
        tasa = 0.03;
        // Proceso
        pagaBruta = horas * paga;
        impuesto = pagaBruta * tasa;
        paganeta = pagaBruta - impuesto;
        //Salida
        System.out.println("\nRESUMEN DE PAGOS\n"); 
        System.out.println(String.format("El trabajador %s trabajó %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga Bruta   = %.2f", pagaBruta));
        System.out.println(String.format("Impuestos    = %.2f", impuesto));
        System.out.println(String.format("Paga Neta    = %.2f", paganeta));
    }
}
