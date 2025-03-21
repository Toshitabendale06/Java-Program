import java.util.Scanner;

class FibonacciSeries {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number up to which series has to printed : ");
         int num = input.nextInt();
         System.out.println("Here is the fibonacci series ");

         //Ex = 5 so 0,1,1,2,3
         int a=0,b=1,c;
         for(int i=1 ; i<=num ; i++){
             System.out.print(a+" ");
             c =a+b;
             a=b;
             b=c;
         }
     }
}
