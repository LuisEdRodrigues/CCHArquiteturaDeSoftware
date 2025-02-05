package com.example.service;

import com.example.model.Personagem;

public class GameManager {

    private final PersonagemService service;

    public GameManager(PersonagemService service) {
        this.service = service;
    }

    public void iniciarJogo() {
        Personagem guerreiro = service.getPersonagem("Guerreiro");
        Personagem arqueiro = service.getPersonagem("Arqueiro");
        Personagem mago = service.getPersonagem("Mago");

        guerreiro.display();
        arqueiro.display();
        mago.display();

        // Segunda vez, agora usando cache (deve ser mais rápido)
        System.out.println("Jogador seleciona os personagens novamente...");
        guerreiro = service.getPersonagem("Guerreiro");
        arqueiro = service.getPersonagem("Arqueiro");
        mago = service.getPersonagem("Mago");

        guerreiro.display();
        arqueiro.display();
        mago.display();
    }
}

