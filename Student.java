/**
 * Student
 */
public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
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
        System.out.println("First Name: "+ this.getFirstName());
        System.out.println("Last Name: "+ this.getLastName());
        System.out.println("year of birth: "+ this.getYearOfBirth());
        System.out.println();
    }
}