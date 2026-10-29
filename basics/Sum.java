import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter your second number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);

        input.close();
    }
}

