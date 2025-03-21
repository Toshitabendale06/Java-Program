import java.util.Scanner;

class SwapTwoNo {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first num: ");
         int a = input.nextInt();
         System.out.print("Enter the second num: ");
         int b = input.nextInt();
         int c;
         c = a;
         a = b;
         b = c;
         System.out.println("After swapping \nA = "+a+ "\tB = "+b);
     }
}
