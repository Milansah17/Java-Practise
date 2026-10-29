import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int ssecond = readNumber();
        int sum = first + ssecond;
        System.out.println("your sum is: " + sum);
    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = input.nextInt();
        return number;
    }





    public static void greet(){
        System.out.println("welcome to the calculator\n");
    }
}
