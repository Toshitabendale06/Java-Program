import java.util.Scanner;

class CheckIfVowelOrConstant {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the character to see if it is vowel or not : ");
         char ch = input.next().charAt(0);
         isvowelorconstant(ch);
     }
     public static void isvowelorconstant(char ch){
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
             System.out.println("your char is vowel");
         }else{
             System.out.println("your char is constant");
         }
     }
}
