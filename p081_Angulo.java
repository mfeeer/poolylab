/**
 * Diseña un programa con una función que reciba como parámetro un ángulo entre 0 y 360 grados, y regrese una
palabra con el tipo de ángulo, en base a lo siguiente:
• < 90 agudo,
• = 90 recto,
• >90 y <180 obtuso,
• = 180 llano,
• > 180 y < 360 concavo
Nota:
• Antes de llamar a la función deberá validar que el ángulo es válido (0 a 360).

Notas Generales: Tomar como base los programas ya desarrollados previamente
 */
import java.util.Scanner;
public class p081_Angulo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angulo;

        System.out.println("Introduce un ángulo entre 0 y 360 grados:");
        angulo = scanner.nextInt();

        if (angulo >= 0 && angulo <= 360) {
            String tipo = determinarTipoDeAngulo(angulo);
            System.out.println("El ángulo es: " + tipo);
        } else {
            System.out.println("El ángulo no es válido. Debe estar entre 0 y 360 grados.");
        }
    }

    public static String determinarTipoDeAngulo(int angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo > 90 && angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else if (angulo > 180 && angulo < 360) {
            return "cóncavo";
        } else {
            return "completo";
        }
    }
}


