package week7;

public class Rock {
    private Integer samplesCount;
    protected String description;
    private Double weightInGrams;

    public Rock(Integer samplesCount, Double weightInGrams) {

        this.samplesCount = samplesCount;
        this.weightInGrams = weightInGrams;
        this.description = "Unclassified";

    }

    public Integer getSamplesCount() {
        return samplesCount;
    }

    public String getDescription() {
        return description;
    }

    public Double getWeightInGrams() {
        return weightInGrams;
    }
}
