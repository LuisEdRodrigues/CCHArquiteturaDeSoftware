package com.example;

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

    public abstract void display();

    public abstract int getCount();

    public Personagem(Personagem target){
        this.nome = target.nome + " " + target.getCount();
        this.vida = target.vida;
        this.dano = target.dano;
        this.agilidade = target.agilidade;
    }

    public abstract Personagem clone();
}
