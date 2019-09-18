package week8;

public class NonMetalElement extends Element {

    NonMetalElement(String symbol, Integer atomicNumber, Double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Metal Element");
        System.out.println("Symbol: " + super.symbol
                + ", Atomic Number: " + super.atomicNumber
                + ", Atomic Weight: " + super.atomicWeight
        );
        System.out.println("Poor electrical conductor");
    }
}
