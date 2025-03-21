import java.util.Scanner;

class calAverageMarks {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the subject marks");

         System.out.print("Maths: ");
         int a = input.nextInt();

         System.out.print("Science: ");
         int b = input.nextInt();

         System.out.print("Social: ");
         int c = input.nextInt();

          int sum = a+b+c;
         System.out.println("Your Total marks : "+sum);

          double average ;
          average = sum/3.0;
         System.out.println("Your Average marks are : " +average);
     }
}
