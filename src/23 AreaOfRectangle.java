import java.util.Scanner;

class AreaOfRectangle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the length of Rectangle  : ");
         int length = input.nextInt();
         System.out.print("Enter the breadth of Rectangle  : ");
         int breadth = input.nextInt();

         int Rectangle;
         Rectangle = length*breadth;
         System.out.println("Area Of Rectangle is: " +Rectangle);
     }
}
