package exercise_taxpayer.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double anualInCome, Double healthExpenditures) {
        super(name, anualInCome); // super nos permite reaproveitarmos o construtor da superclass, sendo assim não é necessário realizarmos a atribuição novamente
        this.healthExpenditures = healthExpenditures; // this referência o atributo da class Individual
    }

    public Individual(){
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        /* forma alternativa condicional ternária
        * double basicTax = (getAnualInCome() < 20000) ? getAnualInCome() * 0.15 : getAnualInCome() * 0.25; */
        double basicTax;
        if(getAnualInCome() < 20000) {
            basicTax = getAnualInCome() * 0.15;
        } else {
            basicTax = getAnualInCome() * 0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        if(basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
