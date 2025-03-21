import java.util.Scanner;

class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the year you want to check : ");
         int year = input.nextInt();

         if(year % 400 == 0 || (year % 4 ==0 && year % 100 !=0) ){
             System.out.print("year is a leap year");
         }else{
             System.out.print("year is not leap year");
         }
     }
}
