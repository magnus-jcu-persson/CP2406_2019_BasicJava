package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @Test
    void checkMainIngredient() {
        Sandwich sandwich = new Sandwich();
        String ingredient = "tuna";
        sandwich.setMainIngredient(ingredient);

        assertEquals(sandwich.getMainIngredient(), ingredient);
    }

    @Test
    void checkBreadType() {
        Sandwich sandwich = new Sandwich();
        String type = "wholemeal";
        sandwich.setBreadType(type);

        assertEquals(sandwich.getBreadType(), type);
    }

    @Test
    void checkPrice() {
        Sandwich sandwich = new Sandwich();
        Double price = 77.42;

        sandwich.setPrice(price);
        assertEquals(sandwich.getPrice(), price);
    }
}