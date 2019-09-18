package week8;

public class NonFiction extends Book {

    NonFiction(String title) {
        super(title);
    }

    @Override
    public void setPrice() {
        super.price = 37.99;
    }
}
