package exercise_contabanco_polimorfa;

public class ContaTeste {
    public static void main(String[] args) {
        Pessoa a = new Pessoa("Gabriel", "12345678910");
        a.setContaBancaria(new ContaCorrente(3600d));
        a.getContaBancaria().gerarJuros();
        System.out.println(a.getContaBancaria().getSaldo());
    }
}
