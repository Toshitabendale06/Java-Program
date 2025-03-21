import java.util.Scanner;

class MakeCalculator {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first number  : ");
         int first = input.nextInt();

         System.out.print("Enter the second number  : ");
         int second = input.nextInt();

         System.out.println("operations are = \tmultiplication=1\tdivide=2\taddition=3\tsubtraction=4");
         System.out.print("select opertion: ");
         int ch = input.nextInt();

         int cal;
         if(ch == 1){
             cal =first*second;
             System.out.println("Multiplication of number is: " +cal);
         } else if(ch == 2){
             cal =first/second;
             System.out.println("Divide of number is: " +cal);
         } else if(ch == 3){
             cal =first+second;
             System.out.println("Adition of number is: " +cal);
         }
         else{
             cal =first-second;
             System.out.println("Subtration of number is: " +cal);
         }
     }
}
