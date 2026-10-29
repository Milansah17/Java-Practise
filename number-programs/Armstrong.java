import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find an Armstrong number");
        System.out.print("enter the number: ");
        int num = input.nextInt();
        if (armStrong(num)) {
            System.out.println("given number is an Armstrong number ");
        } else {
            System.out.println("given number is not an Armstrong number ");
        }

    }

    public static boolean armStrong(int num) {

        int i = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        double newNum = 0;
        num = i;
        while (num > 0) {
            int digit = num % 10;
            newNum += Math.pow(digit, count);
            num = num / 10;
        }
        return i == newNum;

        }


    }

