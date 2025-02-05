package com.example.model;

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

    @Override
    public void display() {
        super.display();
        System.out.printf("Mana: %.2f\n\n", mana);
    }
}
