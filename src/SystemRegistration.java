import java.util.ArrayList;
import java.util.Scanner;

public class
SystemRegistration {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<People> peoples = new ArrayList<>();

        while (true) {
            System.out.println("\n--- System of Registration ---");
            System.out.println("1. Add Person");
            System.out.println("2. All Peoples List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sr.nextInt();
            sr.nextLine(); //This line clears the buffer

            if (choice == 1) {
                //Data Collect
                System.out.print("Enter Name: ");
                String name = sr.nextLine();

                System.out.print("Enter Gender: ");
                String gender = sr.nextLine();

                System.out.print("Enter Age: ");
                int age = sr.nextInt();

                System.out.print("Enter Email: ");
                String email = sr.next();

                System.out.print("Enter IdNumber: ");
                String IdNumber = sr.next();

                People people = new People(name, age, gender, email, IdNumber);
                peoples.add(people);

                System.out.println("People added successfully!");

            } else if (choice == 2) {
                // View list of registered people
                System.out.println("\n--- People List: ---");
                for (People p : peoples) {
                    System.out.println(p);
                }
            } else if (choice == 3) {
                //Exit the program
                System.out.println("\n--- Exit");
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
                continue;

            }
        }

        sr.close();
    }
}

