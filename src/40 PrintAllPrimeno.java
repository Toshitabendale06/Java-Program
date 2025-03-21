import java.util.Scanner;

class PrintAllPrimeno {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter first number : ");
         int num1 = input.nextInt();
         System.out.print("Enter second number : ");
         int num2 = input.nextInt();

         for(int i=num1 ; i<=num2 ; i++) {
             int j;
             for (j = 2; j <= i; j++) {
                 if (i % j == 0)
                     break;
             }
             if (i == j)
                 System.out.println(j);
         }
     }
}
