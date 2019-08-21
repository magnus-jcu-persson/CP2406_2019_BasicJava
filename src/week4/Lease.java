package week4;

public class Lease {
    private String tenant_name;
    private Integer apartment_number;
    private Integer monthly_rent_amount;
    private Integer lease_term;

    public Lease(String tenant_name,
                 Integer apartment_number,
                 Integer monthly_rent_amount,
                 Integer lease_term
    ) {
        setTenantName(tenant_name);
        setApartmentNumber(apartment_number);
        setMonthlyRentAmount(monthly_rent_amount);
        setLeaseTerm(lease_term);
    }

    public void addPetFee() {
        setMonthlyRentAmount(monthly_rent_amount + 10);
    }

    private static void explainPetPolicy() {
        System.out.println("The pet policy is clear, you have had $10 added to your monthly rent.");
    }

    public String getTenantName() {
        return tenant_name;
    }

    public void setTenantName(String tenant_name) {
        this.tenant_name = tenant_name;
    }

    public Integer getApartmentNumber() {
        return apartment_number;
    }

    public void setApartmentNumber(Integer apartment_number) {
        this.apartment_number = apartment_number;
    }

    public Integer getMonthlyRentAmount() {
        return monthly_rent_amount;
    }

    public void setMonthlyRentAmount(Integer monthly_rent_amount) {
        this.monthly_rent_amount = monthly_rent_amount;
    }

    public Integer getLeaseTerm() {
        return lease_term;
    }

    public void setLeaseTerm(Integer lease_term) {
        this.lease_term = lease_term;
    }
}
