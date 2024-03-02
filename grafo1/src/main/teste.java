package grafo1.src.main;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String nome;
    private String habitat;

    public Animal(String nome, String habitat) {
        this.nome = nome;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

class Ecossistema{
    private String tipo;
    private String habitat;
    private float taxaDeMortalidade;

    public Ecossistema(String tipo, float taxaDeMortalidade, String habitat) {
        this.tipo = tipo;
        this.taxaDeMortalidade = taxaDeMortalidade;
        this.habitat = habitat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTaxaDeMortalidade() {
        return taxaDeMortalidade;
    }

    public void setTaxaDeMortalidade(float taxaDeMortalidade) {
        this.taxaDeMortalidade = taxaDeMortalidade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}