package org.example.gradeCalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {

//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            // multipliedCreditAndCourseGrade 코드를 변경 하면, 사용하는 곳마다 변경을 해줘야한다.
//            // 이렇게 작성하게 되면 코드의 응집도가 낮아지기 때문에
//            // multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//
//            // 객체에게 작업을 위임하고 메세지를 전달하여 처리하도록 변경.
//            // 변화에 유연한 코드가 됌.
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;

        //리펙토링
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
