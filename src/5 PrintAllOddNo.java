import java.util.Scanner;

class PrintAllOddNo {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter number : ");
         int num = input.nextInt();
         for(int i=1 ; i<=num ; i=i+2){
             System.out.println(i);
         }
     }
}
