package exercise_taxpayer.entities;

public class Individual extends TaxPayer {
    public Individual() {
    }

    public Individual(String name, Double anualInCome) {
        super(name, anualInCome);
    }

    @Override
    public double tax() {
        return 0;
    }
}
