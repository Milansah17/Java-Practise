import java.util.Scanner;

public class Palinedrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to palinedrome");
        System.out.print("enter the number: ");
        int num = input.nextInt();
        if(PalineDrome(num)){
            System.out.println(num + "  is a palinedrome");
        }
        else {
            System.out.println("given number is not a palinedrome");
        }

    }
    public static boolean PalineDrome(int num){
        int i = num;
        int newNum = 0;
        while(num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return i == newNum;

    }
}
