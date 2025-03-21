import java.util.Scanner;

class SumOfOddEven {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter number : ");
         int num = input.nextInt();
                                   //for even
         if(num % 2 == 0 ) {
             int sum = 0;
             for (int i = 0; i <= num; i = i + 2) {
                 sum = sum + i;
             }
             System.out.println("sum of even number: " + sum);
         }
                               //for odd
         else{
             int sum = 0;
             for(int i=1 ; i<=num ; i=i+2){
                 sum = sum + i;
             }
             System.out.println("sum of odd number: " + sum);
         }
     }
}
