package exercise_hobbies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String nome;
    private int idade;
    private String email;
    private String cpf;
    private String telefone;
    private List<Hobbie> hobbies = new ArrayList<>();
    private ContaBancaria contaBancaria;

    public Person(String nome, int idade ) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void addHobby(Hobbie hobbie){
        this.hobbies.add(hobbie);
    }

    public List<Hobbie> getFavHobbies() {
        return hobbies.stream().filter(hobbie -> hobbie.getPreferencia() >= 8).collect(Collectors.toList());
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}