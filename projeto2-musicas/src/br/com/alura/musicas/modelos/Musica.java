package br.com.alura.musicas.modelos;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String a) {
        album = a;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String c) {
        cantor = c;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String g) {
        genero = g;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        }
        return 7;
    }
}
