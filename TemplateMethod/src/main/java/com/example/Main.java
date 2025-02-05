package com.example;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Guerreiro", 80, 75, 5);
        Personagem arqueiro = new Arqueiro("Arqueiro", 35, 30,75, 30);
        Personagem mago = new Mago("Mago", 70, 55, 40, 60);

        guerreiro.turno();
        arqueiro.turno();
        mago.turno();
    }
}