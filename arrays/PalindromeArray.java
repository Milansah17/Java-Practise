public class PalinedromeArray {
    public static void main(String[] args) {
        System.out.println("welcome to find palinedrome ");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPaline = ispalinedrome(numArr);
        if (isPaline){
            System.out.println("given array is an Palinedrome");
        } else{
            System.out.println("given array is not an Palinedrome");
        }
    }
    public static boolean ispalinedrome(int[] numArr){
        int i = 0;
        while(i < numArr.length / 2){
            if(numArr[i] != numArr[(numArr.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
