package Testes;

import Modulos.Categoria;
import Modulos.Cliente;
import Modulos.Livro;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Categoria drama = new Categoria("Drama");
        List<Livro> dramaList = new ArrayList<>();
        Livro livro = new Livro(00, "Pequeno principe", false);
        Livro livro2 = new Livro(00, "Coach Carter", false);
        drama.setLivros(dramaList);
        livro.setCategoria(drama, livro);
        livro2.setCategoria(drama, livro2);


        drama.ExibeLivro();


        Cliente cliente = new Cliente(001, "joao","51978368802", 20);
        cliente.pegaLivroEmprestado(livro);
        livro.ExibeDados();
        cliente.ExibeDados();
        System.out.println("********************************");

        cliente.devolveLivro();
        livro.ExibeDados();
        cliente.ExibeDados();
    }
}
