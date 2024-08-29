package model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String registration;
    private int cpf;
    private List<String> courses;

    public Student(String name, String registration, int cpf) {
        this.name = name;
        this.registration = registration;
        this.cpf = cpf;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void enrollInCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("The Stundent: " + this.name + " has been enrolled into " + course);
        } else {
            System.out.println("Already enrolled course: " + course);
        }
    }

    public void cancelInCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("The Stundent: " + this.name + " has been cancelled into " + course);
        } else {
            System.out.println("Not enrolled course: " + course);
        }
    }

    public void verifyCourse() {
        System.out.println("Curses of the student " + this.name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }

}
