public class PatternPrint1 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 7;
        
  
        for (int i = 1; i <= rows; i++) {
          
            for (int j = 1; j <= cols; j++) {
          
                if (i == 1 || i==rows) {
                    System.out.print("* ");
                } 
           
                else {
      
                    if (j == 1 ) {
                        System.out.print("* ");
                    } 
          
                    else {
   
                        if (i % 2 == j % 2) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }
          
            System.out.println();
        }
    }
}


