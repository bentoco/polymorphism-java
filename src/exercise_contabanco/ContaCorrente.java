package exercise_contabanco;

public class ContaCorrente {
    // Utilizamos Double quando a propriedade pode ser null (ex.: saldo bancário = 0)
    public Double saldo;

    public ContaCorrente(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /*  sem this: parâmetro = parâmetro
        com this: parâmetro objeto estanciado = parâmetro */
    public void gerarJuros() {
        this.saldo = saldo + (saldo * 0.02);
    }
}
