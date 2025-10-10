import java.util.ArrayList;

public class SchoolRepository {
    private ArrayList<Person> records;

    public SchoolRepository() {
        records = new ArrayList<>();
    }

    public void addRecord(Person p) {
        records.add(p);
    }

    public void displayAll() {
        if (records.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Person p : records) {
                System.out.println(p);
            }
        }
    }

    public Person findById(String schoolId) {
        for (Person p : records) {
            if (p.getSchoolId().equalsIgnoreCase(schoolId)) {
                return p;
            }
        }
        return null;
    }

    public boolean deleteRecord(String schoolId) {
        Person p = findById(schoolId);
        if (p != null) {
            records.remove(p);
            return true;
        }
        return false;
    }
}
