package p110_FormaV2;

public class Circulo extends Forma {
    private double Radio;

    public Circulo() {
    }
    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }

    public double getRadio() {return Radio;}
    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }

    public double getPerimetro() {
        return Math.PI * (Radio * 2);
    }

    public String toString() {
        return "Circulo    [" + super.toString() + ", Radio=" + Radio + "]";
    }
}