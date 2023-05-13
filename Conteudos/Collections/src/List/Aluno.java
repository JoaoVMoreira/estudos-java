public class Aluno implements Comparable<Aluno>{
    //Comparable é a inteface implementada para que os valores possam ser ordenados pela Collections.sort
    private String nome, curso;
    private Integer nota;

    public Aluno(String nome, String Curso, Integer nota){
        this.curso = curso;
        this.nome = nome;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }




    //TOOSTRING Utilizaodo para que os dados apresentados sejam em String
    @Override
    public String toString() {
        return this.nome;
    }

    //Metodo implementado pela interface
    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
    }
}
