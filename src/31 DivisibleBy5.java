import java.util.Scanner;

class DivisibleBy5 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number to check if it divisible by 5 : ");
         int num = input.nextInt();
         if(num % 5 ==0 ){
             System.out.println("divisible by 5");
         }else{
             System.out.println("Not divisible by 5");
         }
     }
}
