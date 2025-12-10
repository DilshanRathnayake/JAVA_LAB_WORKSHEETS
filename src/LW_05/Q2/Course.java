package LW_05.Q2;

public class Course {

    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = 0;
        this.lecturerInCharge = null;
        this.degreeBelongsTo = null;
    }

    public void displayInfo() {
        System.out.println("Course: " + name + " (" + enrollType + ")");
        System.out.println("  Students Enrolled: " + numberOfStudentsEnrolled);

        String lecturerName = (lecturerInCharge != null) ? lecturerInCharge.getName() : "None Assigned";
        System.out.println("  Lecturer In Charge: " + lecturerName);

        String degreeName = (degreeBelongsTo != null) ? degreeBelongsTo.getName() : "Not Part of a Degree";
        System.out.println("  Belongs to Degree: " + degreeName);
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
        lecturer.addCourse(this);
        System.out.println(lecturer.getName() + " is now in charge of the course '" + name + "'.");
    }

    public void removeLecturerInCharge() {
        if (this.lecturerInCharge != null) {
            this.lecturerInCharge.removeCourse(this);
            System.out.println(this.lecturerInCharge.getName() + " is no longer in charge of the course '" + name + "'.");
            this.lecturerInCharge = null;
        } else {
            System.out.println("No lecturer is currently in charge of the course '" + name + "'.");
        }
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }

    public void incrementStudentEnrollment() {
        this.numberOfStudentsEnrolled++;
    }

    public void decrementStudentEnrollment() {
        if (this.numberOfStudentsEnrolled > 0) {
            this.numberOfStudentsEnrolled--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public Integer getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public Lecturer getLecturerInCharge() {
        return lecturerInCharge;
    }

    public Degree getDegreeBelongsTo() {
        return degreeBelongsTo;
    }


}
