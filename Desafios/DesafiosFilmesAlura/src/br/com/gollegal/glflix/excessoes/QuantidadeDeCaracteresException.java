package br.com.gollegal.glflix.excessoes;

public class QuantidadeDeCaracteresException extends Exception{ //Criando exception e extendendo a classe mão Exception
    private String mensage; //Criando o atributo da mensagem

    public QuantidadeDeCaracteresException(String mensage) {
        this.mensage = mensage;//Recebendo a mensagem retornada pelo sistema e atribuindo-a ao atributo message
    }

    public String getMessage() {
        return mensage; //Get message para apresentar a mensagem
    }
}
