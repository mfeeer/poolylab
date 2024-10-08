package p099_Circulo;

public class Circulo {
    private double radio;
    private double area;
    private double circunferencia;
    public String getCircunferencia;
    public Circulo() {
    }
    public Circulo(double radio) { this.radio = radio;}
   
    public double getArea() { return Math.PI * (radio * radio); }
    public void setArea(double area) {this.area = area;}
    
    public double getRadio() {return radio;}
    public void setRadio(double radio) {this.radio = radio;}
    
    public double getCircunferencia() { return 2 * (Math.PI*radio);}
    public void setCircunferencia(double circunferencia) {this.circunferencia = circunferencia;}
    
    public String toString() {
        return "Circulo [radio =" + radio + "]";
    }
       
    
}

