import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("right half pyramid");
        System.out.print("enter the number of rows: ");
        int maxRows = input.nextByte();
        ReverseRightHandPyramid(maxRows);
        RightHandPyramid(maxRows);
        LeftHandPyramid(maxRows);

    }public static void LeftHandPyramid(int maxRows){

        int rows = maxRows;
        while(rows > 0 ) {
            int j = 0;
                    while(j < rows - 1){
                        System.out.print("  ");
                        j++;
                    }
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }









    public static void ReverseRightHandPyramid(int maxRows){

        int rows = maxRows;
        while(rows > 0 ){
            int i = 0;
            while ( i < rows ) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }


    }
    public static void RightHandPyramid(int maxRows){

        int rows = 0;
        while(rows < maxRows ) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
        }





}
