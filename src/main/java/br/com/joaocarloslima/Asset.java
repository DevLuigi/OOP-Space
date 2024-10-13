package br.com.joaocarloslima;


import javafx.scene.image.ImageView;

public abstract class Asset {
    private int y;
    private int x;
    private ImageView imagem;
    private  int velocidade;
    private Direcao direcao;

    public Asset() {}

    public Asset(int x, int y, int velocidade, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public void mover() {
        switch (direcao) {
            case CIMA:
                this.y -= this.velocidade;
                break;
            case DIREITA:
                this.x += this.velocidade;
                break;
            case BAIXO:
                this.y += this.velocidade;
                break;
            case ESQUERDA:
                this.x -= this.velocidade;
                break;
        }
    }

    public boolean colidiuCom(Asset asset) {
        return  x < asset.getX() + 50 &&
                x + 50 > asset.getX() &&
                y < asset.getY() + 50 &&
                y + 50 > asset.getY();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}
