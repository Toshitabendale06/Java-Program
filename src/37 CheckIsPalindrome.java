import java.util.Scanner;

class CheckIsPalindrome {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter number : ");
         int num = input.nextInt();
         int rem, b=0 , c;
         c = num;
         while(num > 0){
              rem=num%10;
              b=(b*10)+rem;
              num=num/10;
         }
         if(c == b){
             System.out.println("Palindrome number");
         }else{
             System.out.println("not Palindrome number");
         }
     }
}
