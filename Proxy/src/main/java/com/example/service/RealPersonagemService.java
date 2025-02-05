package com.example.service;

import com.example.model.*;

public class RealPersonagemService implements PersonagemService{
    @Override
    public Personagem getPersonagem(String nome) {
        System.out.println("Buscando personagem " + nome);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return switch (nome.toLowerCase()) {
            case "guerreiro" -> new Guerreiro("Guerreiro", 80, 75, 5);
            case "arqueiro" -> new Arqueiro("Arqueiro", 35, 30, 75, 30);
            case "mago" -> new Mago("Mago", 70, 55, 40, 60);
            default -> throw new IllegalArgumentException("Personagem não encontrado!");
        };
    }
}
