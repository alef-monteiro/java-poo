package model;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date dateOfBirth;

    public Person(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
        this.name = "Unknown Person";
        this.age = 18;
        this.dateOfBirth = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person(" +
                "name" + this.name + '\'' +
                ", age" + this.age +
                ", dateOfBirth" + this.dateOfBirth +
                ')';
    }

}
