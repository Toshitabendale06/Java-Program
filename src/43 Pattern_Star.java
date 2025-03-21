import java.util.Scanner;

class Pattern_Star {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int rows = input.nextInt();
         pattern1(rows);
         pattern2(rows);
         pattern3(rows);
         pattern4(rows);
         pattern5(rows);
         pattern6(rows);
         pattern7(rows);
         pattern8(rows);

     }
    public static void pattern1(int rows) {
        System.out.println("\tRight half pattern");
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int rows){
        System.out.println("\treverse half pattern");
        for(int i=1 ; i<=rows ; i++){
            for(int j=rows ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int rows) {
        System.out.println("\tLeft half pattern");
        for(int i=1 ;i<=rows ; i++){        //rows
            for(int k=i ; k<rows ;k++)      //space
            {
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++)           //column
            {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

    public static void pattern4(int rows) {
        System.out.println("\treverse left half pattern");
        for(int i=1 ; i<=rows ; i++){
            for(int k=1 ; k<i ; k++){
                System.out.print("  ");
            }
            for(int j=i ; j<=rows ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int rows) {
        System.out.println("\tprint in sqaure");
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=rows ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int rows) {
        System.out.println("\t print sqaure pattern but empty the inner of sqaure");
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=rows ; j++){
               if(i==1 || i==rows || j==1 || j==rows){
                   System.out.print("* ");
               }
               else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }

    public static void pattern7(int rows) {
        System.out.println("\t print half star");
        for(int i=1 ; i<=rows ; i++){
            for(int j=rows ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int rows) {
        System.out.println("/t print half star");
        for(int i=1 ; i<=rows ; i++){
            for(int j=rows ; j>=i ; j--){
                System.out.print("  ");
            }
            for(int k=1 ; k<=i*2-1 ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

