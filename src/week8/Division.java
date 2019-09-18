package week8;

public abstract class Division {
    protected String name;
    protected Integer accountNumber;

    Division(String name, Integer accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
