public class Function {
    public static void main(String[] args) {
        firstPattern();
        secondPattern();
    }

    public static void firstPattern() {
        int i = 0;
        while (i < 5) {
            System.out.print("*");
            int j = 0;
            while (j < i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;


        }
    }


    public static void secondPattern() {
        int a = 0;
        while (a < 5) {

            System.out.print("*");
            int b = 4;
            while (b > a) {
                System.out.print(" *");
                b--;
            }
            System.out.println();
            a++;


        }
    }
}


