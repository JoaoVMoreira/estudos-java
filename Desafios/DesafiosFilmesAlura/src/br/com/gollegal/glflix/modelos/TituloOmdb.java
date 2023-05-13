package br.com.gollegal.glflix.modelos;

public record TituloOmdb(String title, String year, String runtime) { //Criando record para sinalizar os dados a serem recebidos na requisição HTTP
}
