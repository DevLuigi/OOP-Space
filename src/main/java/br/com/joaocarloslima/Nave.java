package br.com.joaocarloslima;

public class Nave extends Asset {
    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder) {
        return new Tiro(this.getX(), this.getY(), this.getVelocidade(), Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        int widthLimite = 640 - 50;

        switch (this.getDirecao()) {
            case DIREITA:
                if (this.getX() < widthLimite) {
                    this.setX(this.getX() + this.getVelocidade());
                }
                break;
            case ESQUERDA:
                if (this.getX() > 0) {
                    this.setX(this.getX() - this.getVelocidade());
                }
                break;
        }
    }
}
