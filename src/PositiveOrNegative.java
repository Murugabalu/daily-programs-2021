import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("You have entered a Positive number");
        else if (num < 0)
            System.out.println("You have entered a Negative number");
        else
            System.out.println("You have entered a number that is neither Positive not Negative");
    }
}
