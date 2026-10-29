
public class SumOfArray {
   public static void main (String[] args) {
       System.out.println("sum of Arrays");
       int[] numArray = ArrayUtility.inputArray();


        long sum = Sum(numArray);
       System.out.print("sum of your elements is: " + sum);

       double average = Average(numArray);
       System.out.println("\nAverage of your elemente is: " + average);
    }


    public static long Sum(int[] nums) {
        int i = 0;
        long sum = 0;
        while (i < nums.length) {
            sum += nums[i];
            i++;
        }
            return sum;
    }

    public static double Average(int[] numArray) {
        double sum = Sum(numArray);
        return (sum/ numArray.length);


    }

}







//        int[] myArr = {2,3,4,5,6,7};
//        int i = 0;
//        int sum = 0;
//        while(i < myArr.length){
//            sum += myArr[i];
//            i++;
//        }
//        System.out.println(sum);
//    }
//    }



