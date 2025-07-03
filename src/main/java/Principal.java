import com.curso.java.calculos.CalculadoraDeTempo;
import com.curso.java.modelos.Filme;
import com.curso.java.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(20);
        lost.setMinutosPorEpisodio(45);

        System.out.println("Total de minutos para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
