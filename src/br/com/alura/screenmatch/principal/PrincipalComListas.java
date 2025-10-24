package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filmeFavorito = new Filme("A milhões de quilometros", 2022);
        filmeFavorito.avalia(10);
        Filme queroAssistir = new Filme("Titãs", 2000);
        queroAssistir.avalia(5);
        Filme filmeAguardado = new Filme("Quarteto Fantástico", 2024);
        filmeAguardado.avalia(6);
        Serie serieFavorita = new Serie("Uma questão de química", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeFavorito);
        lista.add(queroAssistir);
        lista.add(filmeAguardado);
        lista.add(serieFavorita);

        System.out.println("Lista:");
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            // Pegar metodos de uma subclasse fazendo o casting
            Filme filme = (Filme) titulo;
            System.out.println("Classificação: " + filme.getClassificacao());
        }
    }
}
