import com.curso.java.calculos.CalculadoraDeTempo;
import com.curso.java.calculos.CalculadoraSalaRetangular;
import com.curso.java.calculos.FiltroRecomendacao;
import com.curso.java.calculos.TabuadaMultiplicacao;
import com.curso.java.modelos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1970);
//        meuFilme.setDuracaoEmMinutos(180);
//        meuFilme.setTotalDeAvaliacoes(10);
//        meuFilme.setSomaDasAvaliacoes(50);
//
//        Serie lost = new Serie();
//        lost.setNome("Lost");
//        lost.setTemporadas(10);
//        lost.setEpisodiosPorTemporada(20);
//        lost.setMinutosPorEpisodio(45);
//
//        System.out.println("Total de minutos para maratonar Lost: " + lost.getDuracaoEmMinutos());
//
//        Filme outroFilme = new Filme();
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
//        outroFilme.setDuracaoEmMinutos(200);
//
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(meuFilme);
//        calculadora.inclui(outroFilme);
//        calculadora.inclui(lost);
//        System.out.println(calculadora.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(meuFilme);
//
//        Episodio episodio = new Episodio();
//        episodio.setNumero(1);
//        episodio.setSerie(lost);
//        episodio.setTotalVisualizacoes(300);
//        filtro.filtra(episodio);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o valor em dólar: ");
//        double valorDolar = scanner.nextDouble();
//        ConversorMoeda conversor = new ConversorMoeda();
//        conversor.converterDolarParaReal(valorDolar);


//        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
//        calculadora.calcularArea(5, 8);
//        calculadora.calcularPerimetro(5, 8);

//        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
//        tabuada.tabuadaMaluca(9);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Joao", 25 );
        Pessoa pessoa2 = new Pessoa("Maria", 22 );
        Pessoa pessoa3 = new Pessoa("Jose", 25 );

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println("Tamanho da lista:  " + listaPessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaPessoas.get(0));

        System.out.println("Lista completa: " + listaPessoas.toString());

        System.out.println("Lista de pessoas:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }

        Collections.sort(listaPessoas);
        System.out.println("Lista de pessoas ordenada:");
        System.out.println(listaPessoas);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        Filme titulo1 = new Filme();
        titulo1.setNome("Titulo 1");
        titulo1.setDiretor("Diretora 1");

        Filme titulo2 = new Filme();
        titulo2.setNome("A Titulo 2");
        titulo2.setDiretor("A Diretora 2");

        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        System.out.println("Lista de títulos:");
        System.out.println(listaTitulos);

        listaTitulos.sort(Comparator.comparing(Titulo::getNome));

        System.out.println(listaTitulos);


    }
}

