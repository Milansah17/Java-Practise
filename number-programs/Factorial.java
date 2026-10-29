import java.util.Scanner;

public class Factorial {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to factoiral");
        System.out.print("enter your number: ");
        int num = input.nextInt();
        long fact = Factorial(num);
        System.out.println("your factorial is: " + fact);
    }
    public static long Factorial(int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i<=num){
            System.out.print(" " + i);
          fact *= i;
            i++;
        }
        System.out.println();
        return fact;

    }
}

