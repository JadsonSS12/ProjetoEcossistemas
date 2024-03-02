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

    public String getHabitat() {
        return habitat;
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

    public float getTaxaDeMortalidade(){
        return taxaDeMortalidade;
    }

    public String getTipo(){
        return tipo;
    }

    public String getHabitat(){
        return habitat;
    }
}