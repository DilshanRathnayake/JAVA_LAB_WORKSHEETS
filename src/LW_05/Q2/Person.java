package LW_05.Q2;

public abstract class Person {

    private String name;

    public abstract void displayInfo();


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public Person(String name){
        this.name = name;
    }

    public void removeCourse(Course course) {
    }
}
