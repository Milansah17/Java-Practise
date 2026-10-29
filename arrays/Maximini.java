import java.util.Scanner;

public class Maximini {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("welcome to find maximum and minimum in a array");
        int[] numArr = ArrayUtility.inputArray();
        int[] result = Maximini(numArr);
        int max = result[0];
        System.out.println("Maximum number in the array is " + max);
        int mini = result[1];
        System.out.println("Minimum number in the array is " + mini);

    }
    public static int[] Maximini(int[] numArr){
        int max = numArr[0];
        int mini = numArr[0];
        int i = 1 ;
        while(i < numArr.length){
            if(numArr[i] > max) {
                max = numArr[i];
            }
            if(numArr[i] < mini) {
                mini = numArr[i];
            }
            i++;
        }
        return new int[] {max, mini};

    }

    }


