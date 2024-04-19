public class NumPattern {
    public static void main(String[] args) {
        int rows = 5;

 
        for (int i = 1; i <= rows; i++) {
            int num = i;
            int increment = rows - 1;


            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");


                num += increment;
                increment--;
            }


            System.out.println(" ");
        }
    }
}

