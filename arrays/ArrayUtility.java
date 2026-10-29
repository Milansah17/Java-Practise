import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of the Array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("please enter the no. of elements " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayNewArray(int[] numArr){
        int i = 0;
        while (i< numArr.length){
            System.out.print(numArr[i] + " ");
            i++;

        }
        System.out.println();
    }
}
