import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array occurence\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("enter the number you want to find: ");
        int num = input.nextInt();
        int occurence  = noOfOccurence(numArr , num);
        System.out.println("Your number is found " + occurence + " times in the array");

    }
    public static int noOfOccurence(int[] numArr , int num){
        int i = 0;
        int occ = 0;
        while(i<numArr.length){
            if(num == numArr[i]){
                occ++;
            }
            i++;

        }
        return occ;
    }
}
