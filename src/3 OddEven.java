import java.util.Scanner;

class OddEven {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter number : ");
         int num = input.nextInt();
         isodddeven(num);
     }
     public static void isodddeven(int num){
         if(num % 2 == 0){
             System.out.println("your number is even");
         }else {
             System.out.println("your number is not even");
         }

     }
}
