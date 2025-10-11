package LW_03.Q4;

public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        Lecture lecture = new Lecture();
        Student student = new Student();

        course.setCourseName("Computer Science");
        course.setCourseCode("CS_2022_042");
        course.setLecture(lecture);


        System.out.println();
        System.out.println(course.getLecture());
        System.out.println(course.getCourseName());
        System.out.println(course.getCourseCode());

        lecture.setLectureName("Rathnayake");
        lecture.setCourseTeaching("Cyber Security");

        System.out.println();
        System.out.println(lecture.getLectureName());
        System.out.println(lecture.getCourseTeaching());

        student.setStudentName("Lahiru");
        student.setDegreeName("BSc(Hons)Computer Science");
        student.setCourseFollowing("Special");

        System.out.println();
        System.out.println(student.getStudentName());
        System.out.println(student.getDegreeName());
        System.out.println(student.getCourseFollowing());




    }
}
