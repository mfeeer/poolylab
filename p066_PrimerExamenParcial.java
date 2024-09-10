
import java.util.Scanner;
public class p066_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        int edad, edadTotal = 0, alumnos = 0, totalAlumnos = 0, docentes = 0, totalDocentes = 0, trabajadores = 0,totalTrabajadores = 0, mujer = 0, totalMujeres = 0, hombre = 0, totalHombres = 0, pagoAlumnos =0, pagoDocentes = 0, pagoTrabajadores = 0, totalPago = 0;
        char opcion, resp = 's';
        Scanner obj = new Scanner (System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        

        while (resp != 'N') {
            System.out.print("Nombre: "); nombre = obj.nextLine();
            System.out.print("Edad: "); edad = obj.nextInt();            
            System.out.println("Si eres mujer escribe una M y si eres hombre una H");             
            System.out.println("Ingresa tu sexo: ");
            opcion = Character.toUpperCase(obj.next().charAt(0));


            switch (opcion) {
                case 'M':
                    mujer++;
                    totalMujeres++;
                    break;
                case 'H':
                    hombre++;
                     totalHombres++;
                    break;
                default:
                    System.out.println("Error en el sistema");
                    continue;

            }

            if (edad >= 23) {
                edadTotal++;
                System.out.println ("Cumples con la edad solicitada, podemos seguir con el proceso....");
                System.out.println("----------------------------------------");
                System.out.println("BIENVENIDO AL PROGRAMA DE INSCRIPCIÓN");
                System.out.println("----------------------------------------");
                System.out.println ("Escribe [A] si eres un alumno, [D] si eres un docente o una [T] si eres un trabajador");
                opcion = Character.toUpperCase(obj.next().charAt(0));

                switch (opcion) {
                    case 'A':
                        alumnos++;
                        totalAlumnos++;
                        pagoAlumnos = alumnos * 40;
                        break;
                    case 'D':
                        docentes++;
                         totalDocentes++;
                         pagoDocentes = docentes * 60;
                        break;
                    case 'T':
                        trabajadores++;
                         totalTrabajadores++;
                         pagoTrabajadores = trabajadores * 80;
                        break;

                    default:
                        System.out.println("Error en el sistema");
                        break;

            }
            totalPago= pagoAlumnos + pagoDocentes + pagoTrabajadores;
            System.out.printf("\nTotal de alumnos : %d", totalAlumnos);
            System.out.printf("\nTotal de docentes : %d", totalDocentes);
            System.out.printf("\nTotal de trabajadores : %d", totalTrabajadores);
            System.out.printf("\nTotal de hombres en general : %d", totalHombres);
            System.out.printf("\nTotal de mujeres en general : %d", totalMujeres);
            System.out.printf("\nTotal de participantes : %d", edadTotal);
            System.out.printf("\nTotal de dinero recaudado de Alumnos : %d", pagoAlumnos);
            System.out.printf("\nTotal de dinero recaudado de docentes : %d", pagoDocentes);
            System.out.printf("\nTotal de dinero recaudado de trabajadores : %d", pagoTrabajadores);
            System.out.printf("\nTotal de dinero en general de todos los participantes : %d", totalPago);
        }else {
            System.out.println("No cumples con la edad que se necesita:(, vuelve pronto");

        } if (totalPago< 50)  {
            System.out.println("\nEl evento concluye con ganancias BAJAS....");
        }else if (totalPago > 50 && totalPago < 1000) {
            System.out.println("\nEl evento concluye con ganancias MODERADAS....");
        }else  if (totalPago > 1000){
            System.out.println("\nEl evento concluye con BUENAS ganancias.....");
        } 
        System.out.print("¿Deseas continuar (s/n)? ");
             resp = Character.toUpperCase(obj.next().charAt(0));
             obj.nextLine();

        }
        System.out.println("Fin del programa....");

    }
}
