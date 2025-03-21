import java.util.Scanner;

class SumOfDigit {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter number : ");
         int num = input.nextInt();
         int a ,sum=0;
         while(num > 0){
             a = num%10;
             sum =sum+a;
             num = num/10;
         }
         System.out.println(sum);
     }
}
