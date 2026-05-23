package Comprehensive;
//Create a Student class with stream (e.g., "Science", "Commerce", "Arts"). Using switch, display eligible courses for each stream.
import java.util.Scanner;
public class Students {
    String Stream;

    public Students(String stream) {
        this.Stream = stream;
    }

    public void displayEligibleCourses() {

        switch (Stream) {
            case "Science":
                System.out.println("Eligible courses for Science stream: Physics, Chemistry, Biology");
                break;
            case "Commerce":
                System.out.println("Eligible courses for Commerce stream: Accountancy, Economics, Business Studies");
                break;
            case "Arts":
                System.out.println("Eligible courses for Arts stream: History, Geography, Psychology");
                break;
            case "exit":
                System.out.println("Exiting the program.");
                
                break;
            default:
                System.out.println("Invalid stream entered.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while(exit==true) {
            System.out.print("Enter the stream (Science/Commerce/Arts/exit): ");
            String stream = scanner.nextLine();
            if(stream.equals("exit")) {
                exit = false;
                break;
            }
            Students student1 = new Students(stream);
            student1.displayEligibleCourses();
        }
        scanner.close();
    }
}