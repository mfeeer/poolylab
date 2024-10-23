package p117_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica, Ajustar {
    private double alto, ancho;

    public Rectangulo (double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    public double getArea() {
        return alto * ancho;
    }
    public double getPerimetro() {
        return 2 * alto * ancho;
    }

    @Override
    public void ajustar(double porcentaje) {
       alto += alto * porcentaje;
       ancho += ancho * porcentaje;
        
    }
    
}
