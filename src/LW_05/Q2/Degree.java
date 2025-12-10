package LW_05.Q2;

import java.util.ArrayList;

public class Degree {


    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name) {
        this.name = name;
        this.numberOfStudents = 0;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("\n--- Degree Information ---");
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students Enrolled: " + numberOfStudents);
        System.out.println("Number of Courses in Degree: " + coursesOffering.size());
    }

    public void offerCourse(Course course) {
        if (!coursesOffering.contains(course)) {
            coursesOffering.add(course);
            course.addDegreeBelongsTo(this);
            System.out.println("Course '" + course.getName() + "' is now part of the " + name + " Degree.");
        } else {
            System.out.println("Course '" + course.getName() + "' is already part of the " + name + " Degree.");
        }
    }

    public void withdrawCourse(Course course) {
        if (coursesOffering.remove(course)) {
            course.removeDegreeBelongsTo();
            System.out.println("Course '" + course.getName() + "' has been withdrawn from the " + name + " Degree.");
        } else {
            System.out.println("Course '" + course.getName() + "' is not currently part of the " + name + " Degree.");
        }
    }

    public void listCoursesOffering() {
        System.out.println("\n--- Courses Offered in " + name + " Degree ---");
        if (coursesOffering.isEmpty()) {
            System.out.println("No courses are currently offered for this degree.");
            return;
        }
        for (Course course : coursesOffering) {
            course.displayInfo();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void incrementStudentCount() {
        this.numberOfStudents++;
    }

    public void decrementStudentCount() {
        if (this.numberOfStudents > 0) {
            this.numberOfStudents--;
        }
    }



}




