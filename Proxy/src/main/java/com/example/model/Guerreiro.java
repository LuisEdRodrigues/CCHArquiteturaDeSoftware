package com.example.model;

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

    @Override
    public void display() {
        super.display();
        System.out.print("\n");
    }

}
