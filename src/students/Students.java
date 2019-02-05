package students;

/**
 *
 * @author Danijela
 */
public class Students {

    private String myName;
    private String lastName;
    private int yearOfBirth;

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Students() {
        this.myName = "Danijela";
        this.lastName = "Herceg";
        this.yearOfBirth = 1979;
    }

    public Students(String myName, String lastName, int yearOfBirth) {
        this.myName = myName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void info() {
        System.out.println("Ime" + " " + this.myName);
        System.out.println("Prezime" + " " + this.lastName);
        System.out.println("Godina rođenja" + " " + this.yearOfBirth);

    }
}
