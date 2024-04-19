public class DiamondPattern {
    public static void main(String[] args) {
        int r = 5;
        for (int m = 1; m <= r; m++) {
            for (int n = r; n > m; n--) {
                System.out.print(" ");
            }

            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        for (int m = r - 1; m >= 1; m--) {

            for (int n = r - 1; n >= m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

