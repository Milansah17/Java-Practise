import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        Table(num);
    }
    public static void Table(int num){
        int i = 1;
        while(i<=10){
            System.out.println(num + " x " + i +" = "+ (num*i));
            i++;
        }
    }
}
