package src.model;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    public List<CourseModel> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<CourseModel> courseList) {
        this.courseList = courseList;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String studentName;
    private int registration;
    private List<CourseModel> courseList = new ArrayList<>();

    public StudentModel(){

    }

    public StudentModel(String name, int registration, List courseList){
        this.studentName = name;
        this.registration = registration;
        this.courseList = courseList;
    }

}
