import java.util.Scanner;

class CalSalaryTax {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number Salary : ");
         int salary = input.nextInt();

         double tax;
         if(salary <= 10000){
             System.out.println("your salary is "+salary+ "\n so no tax");
         }
         else if(salary > 10000 && salary<=100000){
             tax= salary*0.10;
             System.out.println("your salary is "+salary+"\n so there is 10% of tax "+tax);
         }else{
             tax= salary*0.20;
             System.out.println("your salary is "+salary+"\n so there is 20% of tax "+tax);
         }
     }
}
