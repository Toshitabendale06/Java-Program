import java.util.Scanner;

class ConvertCharUpperToLowerCase {
     public static void main(String[] args) {
         char ch2;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter any Characters : ");
         char ch = input.next().charAt(0);
         if(ch >= 'A' && ch <= 'Z'){
              ch2 = Character.toLowerCase(ch);
             System.out.println("Lowercase : "+ ch2);
         }else {
              ch2 = Character.toUpperCase(ch);
             System.out.println("Uppercase : "+ ch2);
         }
     }
}
