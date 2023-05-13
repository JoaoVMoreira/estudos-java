public class Lapis implements ICaneta{

    public String cor;
    @Override
    public void escrever(String texto) {
        System.out.println(texto);
    }

    @Override
    public String getCor() {
        return "preta";
    }
}
