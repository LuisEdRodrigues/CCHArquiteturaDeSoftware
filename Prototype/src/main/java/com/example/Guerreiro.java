package com.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Guerreiro extends Personagem{

    public Guerreiro(String nome, double vida, double dano, double agilidade) {
        super(nome, vida, dano, agilidade);
    }

    public Guerreiro(Guerreiro target){
        super(target);
    }

    private static int count = 0;

    @Override
    public int getCount(){
        return count;
    }

    @Override
    public Personagem clone() {
        count++;
        return new Guerreiro(this);
    }

    @Override
    public void display() {
        System.out.printf("Nome: %s\nDano: %.2f\nVida: %.2f\nAgilidade: %.2f\n\n", this.getNome(), this.getDano(), this.getVida(), this.getAgilidade());
    }
}
