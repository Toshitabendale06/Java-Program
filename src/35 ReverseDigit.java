import java.util.Scanner;

class ReverseDigit {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter number : ");
         int num = input.nextInt();
         int reverse;
         while(num > 0){
             reverse = num%10;
             System.out.print(reverse);
             num = num/10;
         }
     }
}
