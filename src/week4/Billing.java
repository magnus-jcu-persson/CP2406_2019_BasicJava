package week4;

public class Billing {
    private Double tax = 0.08;

    public Double computeBill(Double price) {
        return price + (price * tax);
    }

    public Double computeBill(Double price, Integer numBooksOrdered) {
        Double priceTotal = (price * numBooksOrdered);
        return priceTotal + (priceTotal * tax);
    }

    public Double computeBill(Double price, Integer numBooksOrdered, Double couponValue) {
        Double priceTotal = (price * numBooksOrdered) - couponValue;
        return priceTotal + (priceTotal * tax);
    }
}
