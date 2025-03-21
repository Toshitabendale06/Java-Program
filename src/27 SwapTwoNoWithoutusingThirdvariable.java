import java.util.Scanner;

class SwapTwoNoWithoutusingThirdvariable {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first num: ");
         int a = input.nextInt();
         System.out.print("Enter the second num: ");
         int b = input.nextInt();
         a = a+b;
         b=a-b;
         a=a-b;
         System.out.println("After swapping \nA = "+a+ "\tB = "+b);

     }
}
