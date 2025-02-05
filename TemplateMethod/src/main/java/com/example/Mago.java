package com.example;

import lombok.AllArgsConstructor;
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
    public void ataqueEspecial() {
        System.out.printf("%s gastou 10 de mana causando %.2f de dano em área\n", getNome(), getDano() * 2);
        mana = mana - 10;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Mana: %.2f\n\n", mana);
    }
}
