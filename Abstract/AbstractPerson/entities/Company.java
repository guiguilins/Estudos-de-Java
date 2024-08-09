package Abstract.AbstractPerson.entities;

public class Company extends Person {

    private int employeeNumbers;

    public Company() {

    }

    public Company(String name, double anualRent, int employeeNumbers) {
        super(name, anualRent);
        this.employeeNumbers = employeeNumbers;
    }

    public int getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(int employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    @Override
    public double tax() {
        double companyTax;

        if(getEmployeeNumbers() > 10) {
            companyTax = getAnualRent() * 0.14;
        }
        else {
            companyTax = getAnualRent() * 0.16;
        }

        return companyTax;
    }

}
