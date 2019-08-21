package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void basicTest() {
        Student student = new Student();
        Integer student_id = 6;
        Integer earned_credit_hours = 66;
        Integer earned_points = 666;

        student.setStudentId(student_id);
        student.setEarnedCreditHours(earned_credit_hours);
        student.setEarnedPoints(earned_points);

        assertEquals(student.getStudentId(), student_id);
        assertEquals(student.getEarnedCreditHours(), earned_credit_hours);
        assertEquals(student.getEarnedPoints(), earned_points);
    }

    @Test
    void checkGPA() {
        Student student = new Student();
        Integer earned_credit_hours = 13;
        Integer earned_points = 45;

        student.setEarnedCreditHours(earned_credit_hours);
        student.setEarnedPoints(earned_points);

        assertEquals(student.gpa(), 3.4615384615384617);
    }

    @Test
    void initialiser() {
        Student student = new Student();
        assertEquals(student.getStudentId(), 9999);
        assertEquals(student.getEarnedCreditHours(), 3);
        assertEquals(student.getEarnedPoints(), 12);
    }
}