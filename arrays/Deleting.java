import java.util.Scanner;

public class Deleting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to Array deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("enter the number to delete: ");
        int num = input.nextInt();
        int[] newArr = Delete(numArr , num);
        System.out.println("here is your new Array: ");
        ArrayUtility.displayNewArray(newArr);


    }

    public static int[] Delete(int[] numArr, int num){
        int occ = Occ(numArr,num);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArray = new int[newSize];


        int i = 0 , j = 0;
        while(i<numArr.length){
            if(numArr[i] != num){
                newArray[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArray;


    }



public static int Occ(int[] numArr, int num)  {
    int count = 0;
    int i = 0;
    while(i<numArr.length){
        if(numArr[i] == num) {
            count++;
        }
        i++;
    }
    return count;
}
}