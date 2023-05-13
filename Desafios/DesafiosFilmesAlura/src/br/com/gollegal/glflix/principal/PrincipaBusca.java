package br.com.gollegal.glflix.principal;

import br.com.gollegal.glflix.excessoes.QuantidadeDeCaracteresException;
import br.com.gollegal.glflix.modelos.Titulo;
import br.com.gollegal.glflix.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class PrincipaBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in); //Criando scanner
        System.out.print("Informe o nome de um filme: ");
        var busca = scan.nextLine();//Capturando dados com scanner

        var filmeInformado = "https://www.omdbapi.com/?t=" + busca + "&apikey=727e5a0c"; //Adicionando valor capturado do scanner a URL
        try{ //Tentando executar um comando
            HttpClient client = HttpClient.newHttpClient(); //Requisição HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(filmeInformado)) //Informando URL gerada
                    .build();
            HttpResponse<String> response = client //Resposta da requisição HTTP
                    .send(request, HttpResponse.BodyHandlers.ofString());

            var json = response.body();//Atribuindo o body da response http (resposta) a variavel json
            //System.out.println(json);

            //Utilizando a biblioteca GSON para converter os valores recebidos em json para string e poder apresenta-los

            //Instanciando classe Gson e acionando construtor que irá transformar a primeira letra dos atributos informados no Record
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb meuTitulo = gson.fromJson(json, TituloOmdb.class); //Instanciando Record e informando as classes para gson converter os valores presentes na variavel json para strings
            //System.out.println(meuTitulo);
            //try{
            Titulo meuTituloFilme = new Titulo(meuTitulo); //Instanciando classe Titulo e passando a classe instanciada meuTitulo onde os valores retornados pelo Gson serão tratados e atribuidos aos seus respectivos atributos
            System.out.println(meuTituloFilme);
        }catch (NumberFormatException e){ //Tratando erro
            System.out.println("Ocorreu um erro!");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){//Tratando erro
            System.out.println("Ocorreu um erro!");
            System.out.println(e.getMessage());
        } catch (QuantidadeDeCaracteresException e) {//Tratando erro criado.
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizado corretamente!");


    }
}
