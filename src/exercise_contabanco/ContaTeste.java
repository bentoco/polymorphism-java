package exercise_contabanco;

public class ContaTeste {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(4000d);
        cc.gerarJuros();
        System.out.println(cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(4000d);
        cp.gerarJuros();
        System.out.println(cp.getSaldo());
    }
}
