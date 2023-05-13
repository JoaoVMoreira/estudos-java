package br.com.gollegal.lojaDvd.modulos;

public class Midia {
	private Integer codigo;
	private Double preco;
	private String nome;
	
	public Midia(Integer codigo, Double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}
	
	public String getTipo() {
		return ;
	}
	
	public String getDetalhes() {
		return "Codigo: " + this.codigo + "Preço: " + this.preco + "Nome: " + this.nome;
	}
	
	public void printDados() {
		System.out.println(getTipo() + getDetalhes());
	}
}
