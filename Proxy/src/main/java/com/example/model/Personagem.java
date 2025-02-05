package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Personagem {

    private String nome;
    private double vida;
    private double dano;
    private double agilidade;

    public void display() {
        System.out.printf("Nome: %s\nDano: %.2f\nVida: %.2f\nAgilidade: %.2f\n", this.getNome(), this.getDano(), this.getVida(), this.getAgilidade());
    }

}
