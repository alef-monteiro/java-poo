package src.model;

public class CourseModel {
    private String courseName;
    private float workload;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getWorkload() {
        return workload;
    }

    public void setWorkload(float workload) {
        this.workload = workload;
    }

    public void Course(String courseName, float workload) {
        this.courseName = courseName;
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "courseName='" + courseName + '\'' +
                ", workload=" + workload +
                '}';
    }
}
