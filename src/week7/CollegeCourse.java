package week7;

public class CollegeCourse {
    private String department;
    private Integer courseNumber;
    private Integer credits;
    protected Integer fee;
    private final Integer FEE_RATE = 120;

    public CollegeCourse(String department, Integer courseNumber, Integer credits) {

        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = credits * FEE_RATE;
    }

    public void display() {
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Fee: " + fee);
    }
}
