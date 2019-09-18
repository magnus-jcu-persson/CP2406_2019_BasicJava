package week8;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    InternationalDivision(String name, Integer accountNumber, String country, String language) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("Name: " + super.name
                + ", Account: "
                + super.accountNumber
                + ", Country: " + this.country
                + ", Language: " + this.language
        );
    }
}
