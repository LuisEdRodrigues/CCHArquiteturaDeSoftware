package com.example.model;

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

    @Override
    public void display() {
        super.display();
        System.out.printf("Flechas: %d\n\n", flechas);
    }
}
