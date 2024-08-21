import java.util.Scanner;

public class IT24102763Lab4Q3 {

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number :");
        number = input.nextInt();

        String result = (number > 0) ? "Positive" : (number == 0) ? "Number is Zero" : "Negative";

        System.out.println(result);
    }
}
