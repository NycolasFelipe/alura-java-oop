import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filmeOPoderosoChefao = new Filme();
        filmeOPoderosoChefao.setNome("O Poderoso Chefão");
        filmeOPoderosoChefao.setAnoDeLancamento(1970);
        filmeOPoderosoChefao.setDuracaoEmMinutos(180);
        filmeOPoderosoChefao.exibeFichaTecnica();

        Filme filmeAvatar = new Filme();
        filmeAvatar.setNome("Avatar");
        filmeAvatar.setAnoDeLancamento(2023);
        filmeAvatar.setDuracaoEmMinutos(180);
        filmeAvatar.exibeFichaTecnica();

        Serie serieLost = new Serie();
        serieLost.setNome("Lost");
        serieLost.setAnoDeLancamento(2000);
        serieLost.exibeFichaTecnica();
        serieLost.setTemporadas(10);
        serieLost.setDuracaoEmMinutos(5000);
        serieLost.setEpisodiosPorTemporada(10);
        serieLost.setMinutosPorEpisodio(50);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeOPoderosoChefao);
        calculadora.inclui(filmeAvatar);
        calculadora.inclui(serieLost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeOPoderosoChefao);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieLost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);
    }
}
