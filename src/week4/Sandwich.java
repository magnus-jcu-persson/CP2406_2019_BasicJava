package week4;

public class Sandwich {
    private String bread_type;
    private String main_ingredient;
    private Double price;

    public String getMainIngredient() {
        return main_ingredient;
    }

    public void setMainIngredient(String main_ingredient) {
        this.main_ingredient = main_ingredient;
    }

    public String getBreadType() {
        return bread_type;
    }

    public void setBreadType(String bread_type) {
        this.bread_type = bread_type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
