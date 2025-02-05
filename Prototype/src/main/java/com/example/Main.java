package com.example;

public class Main {
    public static void main(String[] args) {
        //Prototypes:
        Personagem guerreiro = new Guerreiro("Guerreiro", 70, 90, 20);
        Personagem mago = new Mago("Mago", 45, 60, 50, 200);
        Personagem arqueiro = new Arqueiro("Arqueiro", 30, 35, 100, 100);

        Tropas tropas = new Tropas();

        for (int i = 0; i < 3; i++) {
            tropas.addTropa(guerreiro.clone());
        }
        for (int i = 0; i < 5; i++) {
            tropas.addTropa(mago.clone());
        }
        for (int i = 0; i < 3; i++) {
            tropas.addTropa(arqueiro.clone());
        }


        tropas.display();
    }
}