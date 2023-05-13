package AulaArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AulaArray {
    public static void main(String[] args) {
        ArrayList<String> aulas = new ArrayList<>();

        aulas.add("Conhecendo Arrays");
        aulas.add("Aprimorando conhecimento");
        aulas.add("Exercicios");

        aulas.remove(0);

        for(String aula : aulas){
            System.out.println("Aula: " + aula);
        }
        aulas.add("Botando em pratica")
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
