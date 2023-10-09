
import java.util.Scanner;

public class UniversityAdmissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Baraton University Admission System");
        
        // Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter registration number: ");
        String registrationNumber = scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter course: ");
        String course = scanner.nextLine();
        
        // Display student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        
        // Perform admission processing (e.g., save to database)
        // This part would typically involve database operations, which are not included here.
        
        // Close the scanner
        scanner.close();
    }
}
