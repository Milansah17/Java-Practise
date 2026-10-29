import java.util.Scanner;

public class Lcm {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("finding LCM");
        System.out.print("enter your first number: ");
        int first = input.nextInt();
        System.out.print("enter your second number: ");
        int second = input.nextInt();
        int lcm = Lcm(first , second);
        System.out.println("Your LCM is: " +lcm);
    }
    public static int Lcm(int first,int second){
        int i = 1;
        while(true) {
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}