package Abstract.AbstractPerson.entities;

public class Individual extends Person {
    private double healthExp;

    public Individual() {
        super();
    }

    public Individual(String name, double anualRent, double healthExp) {
        super(name, anualRent);
        this.healthExp = healthExp;
    }

    public double getHealthExp() {
        return healthExp;
    }

    public void setHealthExp(double healthExp) {
        this.healthExp = healthExp;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getAnualRent() < 20000.0) {
            basicTax = getAnualRent() * 0.15;
        } else {
            basicTax = getAnualRent() * 0.25;
        }

        basicTax -= getHealthExp() * 0.5;

        if (basicTax < 0.0) {
            basicTax = 0;
        }

        return basicTax;

    }
}
