package p115_Telefono;

public class App {
    public static void main(String[] args) {
        Telefono miTelefono = new Telefono();

        System.out.println("\033[H\033[2J");
        miTelefono.ObtenerCoordenadas();
        miTelefono.iniciarRadio();
        miTelefono.detenerRadio();
    }
}
