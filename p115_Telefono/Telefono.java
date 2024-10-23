package p115_Telefono;

public class Telefono implements Gps, Radio {

    public void ObtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas..... (0, 0)..... estás en casa.....");
        
    }

    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo radio......");
        
    }

    @Override
    public void iniciarRadio() {
       System.out.println(("Iniciandp radio en la super G........."));
        
    }
    
}
