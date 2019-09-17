package week7;

public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet();
        Limerick limerick = new Limerick();
        Haiku haiku = new Haiku();

        System.out.println(couplet.getName() + " lines: " + couplet.getLinesCount());
        System.out.println(limerick.getName() + " lines: " + limerick.getLinesCount());
        System.out.println(haiku.getName() + " lines: " + haiku.getLinesCount());

    }
}
