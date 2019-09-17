package week7;

public class SedimentaryRock extends Rock {
    public SedimentaryRock(Integer samplesCount, Double weightInGrams) {
        super(samplesCount, weightInGrams);
        super.description = "SedimentaryRock";
    }
}
