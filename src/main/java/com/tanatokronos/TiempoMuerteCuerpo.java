package com.tanatokronos;
import java.util.Scanner;
/**
 *
 * @author lemisora
 */

public class TiempoMuerteCuerpo {
    public double calculaTiempo(double tInicial, double tActual, double tAmbiente){
        double k = 0.0015;  //Constante de enfríamiento del cuerpo humano
        return -(1.0 / k) * Math.log((tActual - tAmbiente) / (tInicial - tAmbiente));
    }
    
    public double calculaHoras(){
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura actual del cuerpo
        System.out.print("Ingrese la temperatura actual del cuerpo (en grados Celsius): ");
        double tempActual = scanner.nextDouble();

        // Solicitar al usuario que ingrese la temperatura ambiente
        System.out.print("Ingrese la temperatura ambiente (en grados Celsius): ");
        double tempAmbiente = scanner.nextDouble();

        // Temperatura inicial del cuerpo (suposición típica)
        double tempInicial = 37.0;

        // Calcular el tiempo transcurrido desde la muerte
        //double tiempoTranscurrido = calculaTiempo(tempInicial, tempActual, tempAmbiente);

        //System.out.println("El tiempo transcurrido desde la muerte del cuerpo es aproximadamente: " + tiempoTranscurrido + " minutos.");

        scanner.close();
    }
}
