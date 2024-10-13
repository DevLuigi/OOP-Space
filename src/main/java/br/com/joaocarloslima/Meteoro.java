package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

import java.util.Random;

public class Meteoro extends Asset {
    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
        this.tamanho = new Random().nextInt(7) + 1;
        this.poder = this.tamanho;

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        super.setImagem(new ImageView(App.class.getResource(path).toString()));
    }

    public void tomarTiro(Tiro tiro) {
        this.setPoder(this.getPoder() - tiro.getPoder());
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
