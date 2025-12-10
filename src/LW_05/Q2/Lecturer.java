package LW_05.Q2;

import LW_03.Q4.Course;

import java.util.ArrayList;

public class Lecturer extends Person{



    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
        this.department = null;
        this.coursesTeaching = new ArrayList<>();
    }

    public Lecturer(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        String deptName = (department != null) ? department.getName() : "None Assigned";
        System.out.println("Name: " + getName() + ", Position: " + position + ", Department: " + deptName);
    }

    public void displayDepartmentInfo() {
        System.out.println("\n--- Department Information for " + getName() + " ---");
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println(getName() + " is not currently assigned to a department.");
        }
    }

    public void addCourse(Course course) {
        if (!coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
            System.out.println(getName() + " is now teaching the course '" + course.getName() + "'.");
        } else {
            System.out.println(getName() + " is already teaching the course '" + course.getName() + "'.");
        }
    }

    public void removeCourse(Course course) {
        if (coursesTeaching.remove(course)) {
            System.out.println(getName() + " is no longer teaching the course '" + course.getName() + "'.");
        } else {
            System.out.println(getName() + " was not found teaching the course '" + course.getName() + "'.");
        }
    }

    public void listCoursesTeaching() {
        System.out.println("\n--- Courses Taught by " + getName() + " ---");
        if (coursesTeaching.isEmpty()) {
            System.out.println(getName() + " is not currently teaching any courses.");
            return;
        }
        for (Course course : coursesTeaching) {
            course.displayInfo();
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }






}
