package src.controller;

import src.model.CourseModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseController {
    private Scanner scanner = new Scanner(System.in);

    public List<CourseModel> courseList = new ArrayList<>();
    public CourseModel courseData = new CourseModel();

    public void addCourse(){
        String name_course;
        float workload;

        System.out.println(" Name: ");
        name_course = scanner.next();
        System.out.println(" Hours: ");
        workload = scanner.nextFloat();

        courseData.setCourseName(name_course);
        courseData.setWorkload(workload);
        courseList.add(courseData);
    }

    public void showCourses(){
        for(CourseModel item : courseList){
            System.out.printf("\n %s", item.getCourseName(), " - %f", item.getWorkload(),"\n\n");
        }
    }

    public void editCourse(){
        showCourses();
        
    }

}
