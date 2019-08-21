package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {

    @Test
    void basicTest() {
        String tenant_name = "Test";
        Integer apartment_number = 666;
        Integer monthly_rent_amount = 300;
        Integer lease_term = 12;
        Lease lease = new Lease(
                tenant_name,
                apartment_number,
                monthly_rent_amount,
                lease_term
        );

        assertEquals(lease.getTenantName(), tenant_name);
        assertEquals(lease.getApartmentNumber(), apartment_number);
        assertEquals(lease.getMonthlyRentAmount(), monthly_rent_amount);
        assertEquals(lease.getLeaseTerm(), lease_term);
    }

    @Test
    void addPetFee() {
        String tenant_name = "Test";
        Integer apartment_number = 666;
        Integer monthly_rent_amount = 300;
        Integer lease_term = 12;
        Lease lease = new Lease(
                tenant_name,
                apartment_number,
                monthly_rent_amount,
                lease_term
        );

        lease.addPetFee();

        assertEquals(lease.getMonthlyRentAmount(), monthly_rent_amount + 10);
    }
}