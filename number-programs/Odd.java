import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to oddSum");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("your oddSum till " + num + " is " + (sum));
    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            if(i % 2 ==1){
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }
        System.out.println();
        return sum;

    }
   }



