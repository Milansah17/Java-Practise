public class TwoDimensionalArray {
   public static void main(String[] args) {
//        int[][] arr = new int [2][3];
        int [][] myArr = {{2,3,4}, {5,6,7}, {8,9,1}};

        int i = 0;
        while(i < myArr.length){
            int j = 0;
            while(j< myArr[i].length){
                System.out.print(myArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;

        }


//        arr[0][0] = 5;
//        System.out.println(arr[0][0]);
    }
}
