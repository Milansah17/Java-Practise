import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        int[] myArr = { 1,2,3,5,7,6,4,8,9};
        if(isFound( myArr ,num)){
            System.out.println("your number is found in array");
        }else {
            System.out.println("your number is not found in array");
        }
    }
    public static boolean isFound(int[] myArr , int num){
        int i = 0;
        while(i < myArr.length){
            if(myArr[i] == num){
                return true;
            }
            i++;
        }
        return false;
    }
}
