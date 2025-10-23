package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    // Atributos
    private int tempoTotal;

    // Get
    public int getTempoTotal() {
        return tempoTotal;
    }

    // Metodo
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
