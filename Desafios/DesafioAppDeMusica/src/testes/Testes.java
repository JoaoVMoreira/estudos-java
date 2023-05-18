package testes;

import modulos.Audio;
import modulos.PlayList;
import modulos.Usuario;

public class Testes {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Joao", "joao@mail.com", "123456");
        Audio audio = new Audio();

        audio.setNomeAudio("Reiventar");

        usuario.exibeDados();
        usuario.TocarAudio(audio);
        audio.ExibeAudio();

        PlayList samba = new PlayList("Samba", "so samba bom");
        Audio teste = new Audio();
        teste.setNomeAudio("teste");
        teste.setDuracao(3);
        samba.addAudioPl(teste);
    }


}
