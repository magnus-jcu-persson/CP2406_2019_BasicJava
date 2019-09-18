package week8;

public class Fiction extends Book {

    Fiction(String title) {
        super(title);
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }
}
