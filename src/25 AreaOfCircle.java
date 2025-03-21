import java.util.Scanner;

class AreaOfCircle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the radius of Circle  : ");
         int radius = input.nextInt();

         double Circle;
         Circle = 3.14*radius*radius;
         System.out.println("Area Of Circle is: " +Circle);
     }
}
