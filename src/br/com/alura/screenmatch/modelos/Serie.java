package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    // Atributos
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    // Construtor
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getters e Setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // Metodo
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
