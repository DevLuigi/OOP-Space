package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {
    protected List<Asset> assets = new ArrayList<Asset>();
    protected Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);
    private int pontos;
    private int nivel = 1;

    public Tiro atirar() {
        var tiro = nave.atirar(this.getNivel());
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        int x = new Random().nextInt(639 - 50) + 1;
        var meteoro = new Meteoro(x, 0, 2, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public void pontuar() {
        this.setPontos(this.getPontos()+1);

        if (this.getPontos() % 10 != 0 || this.getNivel() >= 4) {
            return;
        }

        this.setNivel(this.getNivel() + 1);
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
