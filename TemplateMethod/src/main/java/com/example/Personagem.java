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

    public void ataque(){
        System.out.printf("%s atacou causando %.2f de dano\n", nome, dano);
    }
    public void defesa(){
        if (Math.random() < agilidade/100) {
            System.out.printf("%s desviou do ataque!\n", nome);
            return;
        } else {
            double dano = Math.random() * 20;
            System.out.printf("%s recebeu %.2f de dano\n", nome, dano);
            vida = vida - dano;
        }
    }

    //Template Method:
    public void turno(){
        display();
        defesa();
        ataque();
        ataqueEspecial();
        System.out.println();
        display();
        System.out.println();
    }

    public void display() {
        System.out.printf("Nome: %s\nDano: %.2f\nVida: %.2f\nAgilidade: %.2f\n", this.getNome(), this.getDano(), this.getVida(), this.getAgilidade());
    }

    public abstract void ataqueEspecial();
}
