package LW_05.Q2;

public class Main {
    public static void main(String[] args) {


        System.out.println("--- Starting University Management System Simulation ---");

        Department softwareEngineering = new Department("Software Engineering");

        Degree computerScience = new Degree("Computer Science (BSc)");

        Course oop = new Course("Object-Oriented Programming", "Core");
        Course dataStructures = new Course("Data Structures and Algorithms", "Core");
        Course webDev = new Course("Web Development Basics", "Elective");

        Lecturer drSmith = new Lecturer("Dr. Alan Smith", "Senior Lecturer");
        Lecturer msJones = new Lecturer("Ms. Betty Jones", "Lecturer");

        Student alice = new Student("Alice Johnson", "S1001", "1st Year");
        Student bob = new Student("Bob Williams", "S1002", "1st Year");

        System.out.println("\n\n--- Setting Up Relationships and Information ---");

        softwareEngineering.addLecturer(drSmith);
        softwareEngineering.addLecturer(msJones);
        softwareEngineering.appointDepartmentHead(drSmith);
        softwareEngineering.offerCourse(oop);
        softwareEngineering.offerCourse(dataStructures);
        softwareEngineering.offerCourse(webDev);

        computerScience.offerCourse(oop);
        computerScience.offerCourse(dataStructures);
        computerScience.offerCourse(webDev);

        oop.addLecturerInCharge(drSmith);
        dataStructures.addLecturerInCharge(msJones);

        alice.registerDegree(computerScience);
        alice.enrollCourse(oop);
        alice.enrollCourse(dataStructures);
        alice.enrollCourse(webDev);

        bob.registerDegree(computerScience);
        bob.enrollCourse(oop);
        bob.enrollCourse(dataStructures);

        System.out.println("\n\n--- Displaying Final State Information ---");

        softwareEngineering.displayInfo();

        computerScience.displayInfo();
        computerScience.listCoursesOffering();

        System.out.println("\n--- Course Details ---");
        oop.displayInfo();
        dataStructures.displayInfo();
        webDev.displayInfo();

        System.out.println("\n--- Lecturer Details ---");
        drSmith.displayInfo();
        drSmith.listCoursesTeaching();

        System.out.println("\n--- Student Details ---");
        alice.displayInfo();
        alice.listCoursesEnrolled();

        System.out.println("\n--- Simulation Complete ---");


    }
}
