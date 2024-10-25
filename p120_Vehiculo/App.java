package p120_Vehiculo;


public class App {
    public static void main (String[] args) {
        Sedan miSedan = new Sedan ("Jetta", "Fernanda Méndez", 4);
        Suv miSuv = new Suv ("Audi", "Fernanda Méndez", 6);

        System.out.println("\033[H\033[2J");
        System.out.println(miSedan.getNombre() + ", " + miSedan.getPropietario() + ", " + miSedan.getPasajeros());
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println();
        
        System.out.println(miSuv.getNombre() + ", " + miSuv.getPropietario() + ", " + miSuv.getPasajeros());
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
        

    }
}
