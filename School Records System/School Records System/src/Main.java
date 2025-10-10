import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolRepository repo = new SchoolRepository();
        boolean running = true;

        while (running) {
            System.out.println("\n=== School Record Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Staff");
            System.out.println("3. Display All Records");
            System.out.println("4. Display Single Record");
            System.out.println("5. Update Record");
            System.out.println("6. Delete Record");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("School ID: ");
                    String sid = sc.nextLine();
                    System.out.print("First Name: ");
                    String fname = sc.nextLine();
                    System.out.print("Last Name: ");
                    String lname = sc.nextLine();
                    System.out.print("USC Email: ");
                    String email = sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    repo.addRecord(new Student(sid, fname, lname, email, course, year));
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("School ID: ");
                    sid = sc.nextLine();
                    System.out.print("First Name: ");
                    fname = sc.nextLine();
                    System.out.print("Last Name: ");
                    lname = sc.nextLine();
                    System.out.print("USC Email: ");
                    email = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    repo.addRecord(new Staff(sid, fname, lname, email, dept));
                    System.out.println("Staff added.");
                    break;

                case 3:
                    repo.displayAll();
                    break;

                case 4:
                    System.out.print("Enter School ID to view: ");
                    sid = sc.nextLine();
                    Person p = repo.findById(sid);
                    if (p != null) System.out.println(p);
                    else System.out.println("Record not found.");
                    break;

                case 5:
                    System.out.print("Enter School ID to update: ");
                    sid = sc.nextLine();
                    p = repo.findById(sid);
                    if (p != null) {
                        System.out.print("New First Name: ");
                        p.setFirstName(sc.nextLine());
                        System.out.print("New Last Name: ");
                        p.setLastName(sc.nextLine());
                        System.out.print("New Email: ");
                        p.setEmail(sc.nextLine());
                        System.out.println("Record updated.");
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter School ID to delete: ");
                    sid = sc.nextLine();
                    if (repo.deleteRecord(sid)) {
                        System.out.println("Record deleted.");
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
