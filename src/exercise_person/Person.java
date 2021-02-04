package exercise_person;

//Vamos lá:
//        Crie uma classe Pessoa, com os atributos nome, sobrenome, idade, telefone, cpf e e-mail
//        Crie uma classe pra validar o CPF
//        Crie um método na classe Pessoa para imprimir os dados de contato
//        A validacao de CPF não precisa ser complexa. Apenas verifique se o tamanho eh igual a 11
public class Person {
    private String nome;
    private String sobrenome;
    private int idade;
    private int telefone;
    private String cpf;
    private String email;

    public Person (String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

