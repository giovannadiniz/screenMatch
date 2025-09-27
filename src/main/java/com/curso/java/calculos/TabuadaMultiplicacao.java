package com.curso.java.calculos;

import com.curso.java.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 15; i++) {
            int resultadoTabuada = numero * i;
            System.out.println(numero + " X " + i + " = " + resultadoTabuada);
        }
    }

    @Override
    public void tabuadaMaluca(int numero) {
        for(int i = 2; i <=20; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
