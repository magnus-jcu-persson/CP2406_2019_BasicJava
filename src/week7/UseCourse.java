package week7;

import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter course type >> ");
        String courseCode = in.nextLine();

        System.out.print("Enter course number >> ");
        Integer courseNumber = in.nextInt();

        System.out.println("Enter credits >> ");
        Integer credits = in.nextInt();

        switch (courseCode) {
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY":
                LabCourse labCourse = new LabCourse(courseCode, courseNumber, credits);
                labCourse.display();
                break;
            default:
                CollegeCourse collegeCourse = new CollegeCourse(courseCode, courseNumber, credits);
                collegeCourse.display();
                break;
        }
    }
}
