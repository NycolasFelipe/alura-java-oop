package br.com.alura.musicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String a) {
        apresentador = a;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String d) {
        descricao = d;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        }
        return 8;
    }
}
