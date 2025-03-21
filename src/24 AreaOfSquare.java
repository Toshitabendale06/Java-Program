import java.util.Scanner;

class AreaOfSquare {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the side of Square  : ");
         int side = input.nextInt();

         int square;
         square = side*side;
         System.out.println("Area Of square is: " +square);
     }
}
