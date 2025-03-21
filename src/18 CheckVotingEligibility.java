import java.util.Scanner;

class CheckVotingEligibility {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your age to check if you are eligible for voting or not: ");
         int age = input.nextInt();
         if(age >=18){
             System.out.println("your age is "+age+"\nso you are eglible for vote");
         }else{
             System.out.println("your age is "+age+"\nso you are not eglible for vote");
         }
     }
}
