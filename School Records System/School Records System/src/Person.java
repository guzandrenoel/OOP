public class Person {
    private String schoolId;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String schoolId, String firstName, String lastName, String email) {
        this.schoolId = schoolId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Encapsulation: Getters and setters
    public String getSchoolId() { return schoolId; }
    public void setSchoolId(String schoolId) { this.schoolId = schoolId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "ID: " + schoolId + " | " + firstName + " " + lastName + " | Email: " + email;
    }
}
