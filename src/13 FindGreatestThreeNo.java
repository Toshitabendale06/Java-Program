import java.util.Scanner;

class FindGreatestThreeNo {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = input.nextInt();
         System.out.print("Enter the second number: ");
         int b = input.nextInt();
         System.out.print("Enter the third number: ");
         int c = input.nextInt();
         if(a>b || a>c){
             System.out.println(a+" is greatest number");
         } else if (b>c) {
             System.out.println(b+" is greatest number");
         }else{
             System.out.println(c+"is the greatest number");
         }
     }
}
