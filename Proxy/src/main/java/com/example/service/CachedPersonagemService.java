package com.example.service;

import com.example.model.Personagem;

import java.util.HashMap;
import java.util.Map;

public class CachedPersonagemService implements PersonagemService{
    private final PersonagemService service;
    private final Map<String, Personagem> cache = new HashMap<>();

    public CachedPersonagemService(PersonagemService service) {
        this.service = service;
    }

    @Override
    public Personagem getPersonagem(String nome) {
        if (!cache.containsKey(nome)) {
            System.out.println("Personagem " + nome + " não encontrado no cache...");
            cache.put(nome, service.getPersonagem(nome)); // Carrega do serviço e armazena no cache
        } else {
            System.out.println("Recuperando " + nome + " do cache.");
        }
        return cache.get(nome);
    }

}
