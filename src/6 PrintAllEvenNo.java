import java.util.Scanner;

class PrintAllEvenNo {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter number : ");
         int num = input.nextInt();
         for(int i=0 ; i<=num ; i=i+2){
             System.out.println(i);
         }
     }
}
