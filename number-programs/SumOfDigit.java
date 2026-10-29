import java.util.Scanner;

public class SumOfDigit {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sum of integers");
        System.out.print("enter the integer: ");
        int Int = input.nextInt();
        int sum = sumOfDigit(Int);
        System.out.print("sum of your digit is: " + sum);

    }

    private static int sumOfDigit(int Int) {
     int sum = 0;
     while(Int > 0){
         sum += Int % 10;
         Int /= 10;

     }
      return sum;
    }

}
