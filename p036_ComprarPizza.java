/**
 * p036_ComprarPizza - Diseñe un programa que permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de compra con descuento.
 */

 import java.util.Scanner;

 public class p036_ComprarPizza {
    public static void main(String[] args) {
        String tc= "";
        int cp, total;
        double desc = 0.0, tcd;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();//limpia la pantalla
        System.out.println("Tamaños:");
        System.out.println("1. Chica - $5");
        System.out.println("2. Mediana - $10");
        System.out.println("3. Grande - $20");
        System.out.print("Seleccione el tamaño de la pizza que desea comprar: ");
        int opcion = obj.nextInt();

        int precio = 0; 
        switch (opcion) {
            case 1: 
                tc = "Chica";
                precio = 5;
                break;
            case 2: 
                tc = "Mediana";
                precio = 10;
                break;
            case 3: 
                tc = "Grande";
                precio = 20;
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        System.out.print("Ingrese la cantidad de pizzas que desea comprar: ");
        cp = obj.nextInt();

        total = precio * cp;

        if (total > 2000) {
            desc = total * 0.15;
        }
        tcd = total - desc;
        
        System.out.println("El tamaño de la pizza que compró fue: " + tc);
        System.out.println("La cantidad de pizzas que compró fue de: " + cp);
        System.out.println("El total que tiene que pagar es de :" + total);
        System.out.println("Su descuento fue de: " + desc);
        System.out.println("Su total con descuento fue de: " + tcd);

        System.out.println("FIN DEL PROGRAMA...");
    }
}
        

