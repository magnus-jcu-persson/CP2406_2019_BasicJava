package week8;

public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Fiction");
        NonFiction nonFictionBook = new NonFiction("NonFiction");

        System.out.println("Fiction");
        System.out.println(fictionBook.getPrice());
        System.out.println(fictionBook.getTitle());

        System.out.println("Non-Fiction");
        System.out.println(nonFictionBook.getPrice());
        System.out.println(nonFictionBook.getTitle());
    }
}
