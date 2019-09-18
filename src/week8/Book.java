package week8;

public abstract class Book {
    private String title;
    protected Double price;

    public Book(String title) {
        this.title = title;
        setPrice();
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
