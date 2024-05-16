package com.tanatokronos;

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
//        System.out.println(calcula_H_M_S(tiempo_minutos));
        return (float)tiempo_minutos/60;
    }

    public String calcula_H_M_S(double tiempo_minutos){
        return "Aprox. " +(int)tiempo_minutos/60+ " h "+(int)tiempo_minutos%60+" m";
    }
}
