import java.util.Scanner;

class MultiplicationTable {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number for multiplication table : ");
         int num = input.nextInt();

         int mul;
         for(int i=1 ; i<=10 ; i++){
             mul = num*i;
             System.out.println(num+"x"+i+"=" +mul);
         }
     }
}
