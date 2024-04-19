public class FirstDiagonalPattern {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
    
        System.out.println("First Diagonal Pattern:");
        System.out.print("  ");
        for (int c = 1; c <= cols; c++) {
            System.out.print(c + "*");
        }
        System.out.println();
        
      
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + "* ");
            for (int j = 1; j <= cols; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int j = 1; j <= rows; j++) {
            System.out.print(j + "* ");
            for (int i = 1; i <= cols; i++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

