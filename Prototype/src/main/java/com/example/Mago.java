package com.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Mago extends Personagem{

    private double mana;

    public Mago(String nome, double vida, double dano, double agilidade, double mana) {
        super(nome, vida, dano, agilidade);
        this.mana = mana;
    }

    public Mago(Mago target){
        super(target);
        this.mana = target.mana;
    }

    private static int count = 0;

    @Override
    public int getCount(){
        return count;
    }

    @Override
    public Personagem clone() {
        count++;
        return new Mago(this);
    }

    @Override
    public void display() {
        System.out.printf("Nome: %s\nDano: %.2f\nVida: %.2f\nAgilidade: %.2f\nMana: %.2f\n\n", this.getNome(), this.getDano(), this.getVida(), this.getAgilidade(), this.getMana());
    }
}
