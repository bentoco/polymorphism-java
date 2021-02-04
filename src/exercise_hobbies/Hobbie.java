package exercise_hobbies;

public class Hobbie {
    private String nome;
    private int preferencia;

    public Hobbie (String nome, int preferencia){
        this.nome = nome;
        this.preferencia = preferencia;
    }

    public int getPreferencia() {
        return preferencia;
    }

    public String getNome() {
        return nome;
    }
}


