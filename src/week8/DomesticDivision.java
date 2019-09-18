package week8;

public class DomesticDivision extends Division {
    private String state;

    DomesticDivision(String name, Integer accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Name: " + super.name + ", Account: " + super.accountNumber + ", State: " + this.state);
    }
}
