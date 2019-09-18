package week8;

public class Participant {
    private String name;
    private Integer age;
    private String streetAddress;

    Participant(String name, Integer age, String streetAddress) {
        this.name = name;
        this.age = age;
        this.streetAddress = streetAddress;
    }

    public boolean equals(Participant participant) {
        return this.toString().equals(participant.toString());
    }

    public String toString() {
        return "Name: " + this.name
                + ", Age: " + this.age
                + ", Street Address: " + this.streetAddress;
    }

}
