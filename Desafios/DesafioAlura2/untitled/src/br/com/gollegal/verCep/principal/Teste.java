package br.com.gollegal.verCep.principal;

import br.com.gollegal.verCep.modelos.Endereco;
import br.com.gollegal.verCep.records.EnderecoRecord;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu CEP: ");
        var cep = scan.nextLine();

        var link = "https://viacep.com.br/ws/" + cep + "/json/";

        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(link))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            var json = response.body();

            Gson gson = new Gson();
            EnderecoRecord meuEndereco = gson.fromJson(json, EnderecoRecord.class);
            Endereco meuEnderecoTeste = new Endereco(meuEndereco);
            System.out.println(meuEnderecoTeste);
            FileWriter escrita = new FileWriter("Cep.txt");
            escrita.write(meuEnderecoTeste.getBairro());
        }catch (IllegalStateException e){
            System.out.println("Ocorreu um erro. É necessário que o CEP tenha 8 digitos. ");
            System.out.println(e.getMessage());
        }


    }
}
