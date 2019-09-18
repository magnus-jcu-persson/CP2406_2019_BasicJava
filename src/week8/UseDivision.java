package week8;

public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision domesticDivision = new DomesticDivision(
                "NatWest",
                321123,
                "QLD"
        );
        InternationalDivision internationalDivision = new InternationalDivision("CommBankInternational",
                666777,
                "Indonesia",
                "Greek"
        );

        domesticDivision.display();
        internationalDivision.display();
    }
}
