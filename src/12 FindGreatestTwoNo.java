import java.util.Scanner;

class FindGreatestTwoNo {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = input.nextInt();
         System.out.print("Enter the second number: ");
         int b = input.nextInt();
         if(a>b){
             System.out.print(a+" is the greatest number");
         }
         else{
             System.out.print(b+" is the greatest number");
         }
     }

}
