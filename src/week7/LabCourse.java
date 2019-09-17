package week7;

public class LabCourse extends CollegeCourse {
    public LabCourse(String department, Integer courseNumber, Integer credits) {
        super(department, courseNumber, credits);
        super.fee += 50;
    }

    @Override
    public void display() {
        System.out.println("Lab Course");
        super.display();

    }
}
