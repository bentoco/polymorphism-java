package exercise_taxpayer.entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(String name, Double anualInCome, Integer numberOfEmployees) {
        super(name, anualInCome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        return getNumberOfEmployees() > 10 ? getAnualInCome() * 0.14 : getAnualInCome() * 0.16;
    }
}
