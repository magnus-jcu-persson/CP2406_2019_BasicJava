package week8;

public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = {
                new Fiction("Fiction1"),
                new NonFiction("NonFiction1"),
                new NonFiction("NonFiction2"),
                new NonFiction("NonFiction3"),
                new Fiction("Fiction2"),
                new Fiction("Fiction3"),
                new Fiction("Fiction4"),
                new Fiction("Fiction5"),
                new Fiction("Fiction6"),
                new NonFiction("NonFiction4")
        };

        for (var i = 0; i < bookArray.length; i++) {
            System.out.println("Title: " + bookArray[i].getTitle() + ", Price: " + bookArray[i].getPrice());
        }
    }
}
