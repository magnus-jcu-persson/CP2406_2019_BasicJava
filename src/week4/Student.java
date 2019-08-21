package week4;

public class Student {
    private Integer student_id;
    private Integer earned_credit_hours;
    private Integer earned_points;

    public Student() {
        setStudentId(9999);
        setEarnedCreditHours(3);
        setEarnedPoints(12);
    }

    public Integer getStudentId() {
        return student_id;
    }

    public void setStudentId(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getEarnedCreditHours() {
        return earned_credit_hours;
    }

    public void setEarnedCreditHours(Integer earned_credit_hours) {
        this.earned_credit_hours = earned_credit_hours;
    }

    public Integer getEarnedPoints() {
        return earned_points;
    }

    public void setEarnedPoints(Integer earned_points) {
        this.earned_points = earned_points;
    }

    public Double gpa() {
        if (earned_credit_hours == null || earned_points == null) {
            return 0.0;
        }

        return Double.valueOf(earned_points) / Double.valueOf(earned_credit_hours);
    }
}
