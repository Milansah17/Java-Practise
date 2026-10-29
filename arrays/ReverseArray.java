public class ReverseArray {
   public static void main(String[] args) {
        System.out.println("welcome to array reverse \n");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        ArrayUtility.displayNewArray(numArr);
    }

    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }


    }


}
