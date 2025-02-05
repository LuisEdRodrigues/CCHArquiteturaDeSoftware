package com.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Arqueiro extends Personagem{

    private int flechas;

    public Arqueiro(String nome, double vida, double dano, double agilidade, int flechas) {
        super(nome, vida, dano, agilidade);
        this.flechas = flechas;
    }

    public Arqueiro(Arqueiro target){
        super(target);
        this.flechas = target.flechas;
    }

    private static int count = 0;

    @Override
    public int getCount(){
        return count;
    }

    @Override
    public Personagem clone() {
        count++;
        return new Arqueiro(this);
    }

    @Override
    public void display() {
        System.out.printf("Nome: %s\nDano: %.2f\nVida: %.2f\nAgilidade: %.2f\nFlechas: %d\n\n", this.getNome(), this.getDano(), this.getVida(), this.getAgilidade(), this.getFlechas());
    }
}
