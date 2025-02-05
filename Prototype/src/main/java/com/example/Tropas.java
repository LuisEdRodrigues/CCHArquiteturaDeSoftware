package com.example;

import java.util.ArrayList;
import java.util.List;

public class Tropas {
    private List<Personagem> tropas = new ArrayList<>();

    public void addTropa(Personagem tropa){
        tropas.add(tropa);
    }

    public void display(){
        for(Personagem p : tropas){
            p.display();
        }
    }
}
