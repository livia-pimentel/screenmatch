package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um filme para busca: ");
        var busca = scanner.nextLine();

        // Codifica a string de busca para ser segura para URL
        String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        String endereco = "https://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=156a41fc";
        // Requisição HTTP
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        String json = response.body();

//        client.sendAsync (request, HttpResponse.BodyHandlers.ofString())
//                .thenApply (HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);

        System.out.println(meuTitulo);
    }
}
