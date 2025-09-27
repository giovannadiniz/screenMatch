package com.curso.java.modelos;

import com.curso.java.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    double valorDolar;

    @Override
    public double converterDolarParaReal(Double valorDolar) {
        if (valorDolar > 0) {
            System.out.println("O valor em reais é: " + valorDolar * 5.25);
        } else {
            throw new IllegalArgumentException("Valor do dólar deve ser maior que 0");
        }
        return 0;
    }
}
