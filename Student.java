/**
 * Student
 */
public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;

    public Student() {
    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public Student(String firstName, String lastName, int yearOfBirth, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setYearOfBirth(int year){
        this.yearOfBirth = year;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void printInConsole(){
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        this.getCourse().printInConsole();
        System.out.println();
    }
}