package exercise_hobbies;

public class ContaCorrente implements ContaBancaria {
    private Double saldo;

    public ContaCorrente(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return saldo;
    }
    public void gerarJuros(){
        this.saldo = saldo + (saldo * 0.02);
    }
}
