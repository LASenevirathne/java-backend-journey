import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter id: ");
                int id = sc.nextInt();

                students.add(new Student(name, id));
                System.out.println("Student added.");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (Student s : students) {
                        System.out.println("Name: " + s.name + ", ID: " + s.id);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter id to delete: ");
                int id = sc.nextInt();

                boolean removed = students.removeIf(s -> s.id == id);
                if (removed) {
                    System.out.println("Student deleted.");
                } else {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
                
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        sc.close();
    }
}
