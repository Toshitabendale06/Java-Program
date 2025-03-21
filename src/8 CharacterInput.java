import java.util.Scanner;

class CharacterInput {
     public static void main(String[] args) {
         char ch;
         Scanner input = new Scanner(System.in);
         System.out.print("enter Character  : ");
         ch = input.next().charAt(4);
         System.out.println(ch);
      }
}
