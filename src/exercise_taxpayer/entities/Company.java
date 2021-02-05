package exercise_taxpayer.entities;

public class Company extends TaxPayer {
    public Company() {
    }

    public Company(String name, Double anualInCome) {
        super(name, anualInCome);
    }

    @Override
    public double tax() {
        return 0;
    }
}
