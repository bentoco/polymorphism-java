package exercise_taxpayer.entities;

public abstract class TaxPayer {
    private String name;
    private Double anualInCome; // renda anual

    /* sempre uma boa pratica declarar um construtor vazio e outro com argumentos                          *
     * isso permite que seja possível instância com ou sempre args e também vários frameworks utilizam sem */
    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualInCome){
        super();
        this.name = name;
        this.anualInCome = anualInCome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualInCome(){
        return anualInCome;
    }

    public void setAnualInCome(Double anualInCome){
        this.anualInCome = anualInCome;
    }

    public abstract double tax();
}
