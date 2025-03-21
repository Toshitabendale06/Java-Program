import java.util.Scanner;

class PrintASCII {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the character to see its ASCII value : ");
         char ch = input.next().charAt(0);

         int a;
         a = ch;
         System.out.println(" ASCII value of "+ ch +" is: "+a);
     }
}
