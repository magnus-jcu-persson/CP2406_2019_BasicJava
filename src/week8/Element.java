package week8;

public abstract class Element {
    protected String symbol;
    protected Integer atomicNumber;
    protected Double atomicWeight;

    Element(String symbol, Integer atomicNumber, Double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public abstract void describeElement();
}
