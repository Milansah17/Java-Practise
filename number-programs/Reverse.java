import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        int reverse = Reverse(num);
        System.out.println("yourn reverse number: " + reverse);


    }
    public static int Reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;
    }


}
