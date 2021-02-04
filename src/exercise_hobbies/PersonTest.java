package exercise_hobbies;

import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Gabriel", 10);
        p.setCpf("44444444444");
        p.setEmail("gabriel@bei.com");
        p.setTelefone("707070709");
        p.addHobby(new Hobbie("Basketball", 10));
        p.addHobby(new Hobbie("Tenis", 5));
        p.addHobby(new Hobbie("Jangada", 8));
        p.addHobby(new Hobbie("Volei", 9));
        p.setContaBancaria(new ContaCorrente(4000d));
        p.getContaBancaria().gerarJuros();
        System.out.println(p.getContaBancaria().getSaldo());

        List<Hobbie> favList = p.getFavHobbies();
        favList.forEach(hobbie -> System.out.println(hobbie.getNome()));
        List<String> hobbieNames = favList.stream().map(Hobbie::getNome).collect(Collectors.toList());
        hobbieNames.forEach(hobbie -> System.out.println("mapeamento do objeto hobbie " + hobbie));

        Person w = new Person("Gabriel", 10);
        w.setCpf("44444444444");
        w.setEmail("gabriel@bei.com");
        w.setTelefone("707070709");
        w.addHobby(new Hobbie("Basketball", 10));
        w.addHobby(new Hobbie("Tenis", 5));
        w.addHobby(new Hobbie("Jangada", 8));
        w.setContaBancaria(new ContaPoupanca(6000d));
        w.getContaBancaria().gerarJuros();
        System.out.println(w.getContaBancaria().getSaldo());
    }
}
