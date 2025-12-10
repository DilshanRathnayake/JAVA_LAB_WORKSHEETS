package LW_05.Q2;

import java.util.ArrayList;


public class Department {


    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.departmentHead = null;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("\n--- Department Information ---");
        System.out.println("Department Name: " + name);
        System.out.println("Courses Offered: " + coursesOffering.size());
        System.out.println("Number of Lecturers: " + lecturersBelongsTo.size());
        displayDepartmentHeadInfo();
    }

    public void appointDepartmentHead(Lecturer departmentHead) {
        this.departmentHead = departmentHead;
        if (!this.lecturersBelongsTo.contains(departmentHead)) {
            addLecturer(departmentHead);
        }
        System.out.println(departmentHead.getName() + " has been appointed as the Head of the " + name + " Department.");
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            System.out.print("Department Head: ");
            departmentHead.displayInfo();
        } else {
            System.out.println("Department Head: Not yet appointed.");
        }
    }

    public void offerCourse(Course course) {
        if (!coursesOffering.contains(course)) {
            coursesOffering.add(course);
            System.out.println("Course '" + course.getName() + "' is now offered by " + name + ".");
        } else {
            System.out.println("Course '" + course.getName() + "' is already offered by " + name + ".");
        }
    }


    public void withdrawCourse(Course course) {
        if (coursesOffering.remove(course)) {
            System.out.println("Course '" + course.getName() + "' has been withdrawn from " + name + " offerings.");
        } else {
            System.out.println("Course '" + course.getName() + "' is not currently offered by " + name + ".");
        }
    }

    public void addLecturer(Lecturer lecturer) {
        if (!lecturersBelongsTo.contains(lecturer)) {
            lecturersBelongsTo.add(lecturer);
            lecturer.setDepartment(this);
            System.out.println("Lecturer " + lecturer.getName() + " has been added to the " + name + " Department.");
        } else {
            System.out.println("Lecturer " + lecturer.getName() + " is already in the " + name + " Department.");
        }
    }

    public void removeLecturer(Lecturer lecturer) {
        if (lecturersBelongsTo.remove(lecturer)) {
            lecturer.setDepartment(null);
            System.out.println("Lecturer " + lecturer.getName() + " has been removed from the " + name + " Department.");
        } else {
            System.out.println("Lecturer " + lecturer.getName() + " is not in the " + name + " Department.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getDepartmentHead() {
        return departmentHead;
    }

    public ArrayList<Course> getCoursesOffering() {
        return coursesOffering;
    }

    public ArrayList<Lecturer> getLecturersBelongsTo() {
        return lecturersBelongsTo;
    }


}

