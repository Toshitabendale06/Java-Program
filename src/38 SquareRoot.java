import java.util.Scanner;

class SquareRoot {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter any number : ");
         int num = input.nextInt();

         double square = Math.sqrt(num);
         System.out.println("Square root of "+num+ "is: "+square);
     }
}
