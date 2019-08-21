package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test
    void computeBillPrice() {
        Billing billing = new Billing();
        assertEquals(billing.computeBill(100.00), 108);
    }

    @Test
    void computeBillPriceNumber() {
        Billing billing = new Billing();
        assertEquals(billing.computeBill(100.00, 10), 1080);
    }

    @Test
    void computeBillPriceNumberCoupon() {
        Billing billing = new Billing();
        assertEquals(billing.computeBill(100.00, 10, 10.00), 1069.20);
    }
}