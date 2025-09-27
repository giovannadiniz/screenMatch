package com.curso.java.calculos;

import com.curso.java.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double largura, double altura) {
        double areaCalculada = largura * altura;
        System.out.println("Área calculada da sala retangular: " + areaCalculada + " metros quadrados.");
    }
    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (largura + altura);
        System.out.println("O perímetro da sala retangular é: " + perimetro + " metros.");
    }
}
