import java.util.Scanner;

public class ITxxxxxxxxLab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();
        System.out.print("Enter lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();

        if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
        } else {
            System.out.print("Enter percentage taken from exam marks: ");
            int examPercentage = scanner.nextInt();
            System.out.print("Enter percentage taken from lab submission marks: ");
            int labPercentage = scanner.nextInt();

            if (examPercentage + labPercentage != 100) {
                System.out.println("Invalid percentages. The total should add up to 100.");
            } else {
                double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
                System.out.println("The final mark is: " + finalMark);
            }
        }
    }
}
	
		
