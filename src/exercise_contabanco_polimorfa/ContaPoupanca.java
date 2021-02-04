package exercise_contabanco_polimorfa;

public class ContaPoupanca implements ContaBancaria {
    private Double saldo;

    public ContaPoupanca(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void gerarJuros(){
        this.saldo = saldo + (saldo * 0.05);
    }
}
