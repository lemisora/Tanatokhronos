package com.tanatokronos;
import java.util.Scanner;
/**
 *
 * @author lemisora
 */
public class TiempoMuerteCuerpo {
    private final double tInicial = 37.5;

    public double gettInicial() {
        return tInicial;
    }

    public double calculaTiempo(double tActual, double tAmbiente){
        double k = 0.0015;  //Constante de enfríamiento del cuerpo humano
        return -(1.0 / k) * Math.log((tActual - tAmbiente) / (tInicial - tAmbiente));
    }
    
    public float calculaHoras(double tiempo_minutos){
        return (float)tiempo_minutos/60;
    }
}
