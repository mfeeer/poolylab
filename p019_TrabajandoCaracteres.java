/** 
 * Trabajando con caracteres 

*/
public class p019_TrabajandoCaracteres {
    public static void main(String[] args) {
            char c1 = 'A', c2 = 'B';
            char numero = '9';
            char arroba = '@';
            char pesos = 36;
            char corazon = '\u2665';
            char letraw = 119;
            char espacio = ' ';
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(numero);
            System.out.println(arroba);
            System.out.println(pesos);
            System.out.println(corazon);
            System.out.println(letraw);
            System.out.println();
            c1++; c2++; numero--;
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(numero);
            System.out.printf("c1 y c2 : %c  %c \n", c1, c2);
            System.out.printf("Los valores de c1 y c2 como enteros : " + Integer.toString(c1) + " " + Integer.toString(c2));
            System.out.println();
            System.out.println(Character.isLetter(c1)); // True
            System.out.println(Character.isDigit(numero)); // True
            System.out.println(Character.isAlphabetic(pesos)); // False
            System.out.println(Character.isSpaceChar(espacio)); // True
    }
}