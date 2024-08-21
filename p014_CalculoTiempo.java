//Dada una cantidad en horas, calcular su equivalente en dias, minutos y segundos considerando que 
// 1 dia tiene 24 horas
//1 hora tiene 60 minutos 
//1 minuto tiene 60 segundos 

import java.util.Scanner;

public class p014_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner hrs = new Scanner (System.in);

        System.out.print(" Dame la cantidad de horas : ");
        horas = hrs.nextFloat();

        dias = (horas / 24);
        minutos = (horas * 60);
        segundos = horas * (60 * 60);

        System.out.println("En días: " + dias + ", en minutos: "+ minutos + ", y en segundos: "+ segundos);
    }    

}