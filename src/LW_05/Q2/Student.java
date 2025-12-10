package LW_05.Q2;

import java.util.ArrayList;

public class Student extends Person{


    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = null;
        this.coursesEnrolled = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        String degreeName = (degree != null) ? degree.getName() : "None Registered";
        System.out.println("Name: " + getName() + ", ID: " + studentID + ", Year: " + year + ", Degree: " + degreeName);
    }

    public void registerDegree(Degree degree) {
        if (this.degree != null) {
            this.degree.decrementStudentCount();
        }
        this.degree = degree;
        this.degree.incrementStudentCount();
        System.out.println(getName() + " (" + studentID + ") has registered for the " + degree.getName() + " Degree.");
    }

    public void displayDegreeInfo() {
        System.out.println("\n--- Degree Information for " + getName() + " ---");
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println(getName() + " is not currently registered for a degree.");
        }
    }

    public void enrollCourse(Course course) {
        if (!coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
            course.incrementStudentEnrollment();
            System.out.println(getName() + " has successfully enrolled in the course '" + course.getName() + "'.");
        } else {
            System.out.println(getName() + " is already enrolled in the course '" + course.getName() + "'.");
        }
    }

    public void unenrollCourse(Course course) {
        if (coursesEnrolled.remove(course)) {
            course.decrementStudentEnrollment();
            System.out.println(getName() + " has successfully unenrolled from the course '" + course.getName() + "'.");
        } else {
            System.out.println(getName() + " was not found enrolled in the course '" + course.getName() + "'.");
        }
    }

    public void listCoursesEnrolled() {
        System.out.println("\n--- Courses Enrolled by " + getName() + " ---");
        if (coursesEnrolled.isEmpty()) {
            System.out.println(getName() + " is not currently enrolled in any courses.");
            return;
        }
        for (Course course : coursesEnrolled) {
            course.displayInfo();
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Degree getDegree() {
        return degree;
    }










}
