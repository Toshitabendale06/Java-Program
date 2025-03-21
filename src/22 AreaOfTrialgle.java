import java.util.Scanner;

class AreaOfTrialgle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the base of triangle  : ");
         int base = input.nextInt();
         System.out.print("Enter the height of triangle  : ");
         int height = input.nextInt();

         double triangle;
         triangle = base*height*0.5;
         System.out.println("Area Of Triangle is: " +triangle);
     }
}
