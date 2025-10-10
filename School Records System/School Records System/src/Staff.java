public class Staff extends Person {
    private String department;

    public Staff(String schoolId, String firstName, String lastName, String email, String department) {
        super(schoolId, firstName, lastName, email);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "[Staff] " + super.toString() + " | Department: " + department;
    }
}
