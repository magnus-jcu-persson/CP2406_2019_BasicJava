package week8;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = {
                new MetalElement("Fe", 26, 55.845),
                new MetalElement("Cu", 29, 63.546),
                new NonMetalElement("N", 7, 14.0067),
                new NonMetalElement("C", 6, 12.011)
        };

        for (Element element : elements) {
            element.describeElement();
        }
    }
}
