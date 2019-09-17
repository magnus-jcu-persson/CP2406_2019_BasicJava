package week7;

public class DemoRocks {
    public static void main(String[] args) {
        Rock rock = new Rock(10, 12.12);
        IgneousRock igneousRock = new IgneousRock(20, 23.23);
        SedimentaryRock sedimentaryRock = new SedimentaryRock(30, 34.34);

        System.out.println("Rock Description: " + rock.getDescription());
        System.out.println("Rock SamplesCount: " + rock.getSamplesCount());
        System.out.println("Rock WeightInGrams: " + rock.getWeightInGrams());

        System.out.println("IgneousRock Description: " + igneousRock.getDescription());
        System.out.println("IgneousRock SamplesCount: " + igneousRock.getSamplesCount());
        System.out.println("IgneousRock WeightInGrams: " + igneousRock.getWeightInGrams());

        System.out.println("SedimentaryRock Description: " + sedimentaryRock.getDescription());
        System.out.println("SedimentaryRock SamplesCount: " + sedimentaryRock.getSamplesCount());
        System.out.println("SedimentaryRock WeightInGrams: " + sedimentaryRock.getWeightInGrams());
    }
}
