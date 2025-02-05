package com.example;

import com.example.model.*;
import com.example.service.*;

public class Main {
    public static void main(String[] args) {
        PersonagemService personagemService = new RealPersonagemService();
        PersonagemService cached = new CachedPersonagemService(personagemService);
        GameManager game = new GameManager(cached);

        game.iniciarJogo();

    }
}