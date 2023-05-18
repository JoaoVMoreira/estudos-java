package modulos;

import java.util.List;

public class PlayList extends Audio{
    private String nomePl;
    private String descricao;
    private List<Audio> listaAudios;

    public PlayList(String nomePl, String descricao){
        this.nomePl = nomePl;
        this.descricao = descricao;
    }

    public String getNomePl() {
        return nomePl;
    }

    public void setNomePl(String nomePl) {
        this.nomePl = nomePl;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void addAudioPl(Audio audio){
        this.listaAudios.add(audio);
        for (Audio item:
             listaAudios) {
            System.out.println(item);
        }
    }

    public void abrePl(){
        for (Audio item : listaAudios) {
            System.out.println(item);
        }
    }


}
