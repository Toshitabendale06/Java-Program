import java.util.Scanner;

class InputMonth {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter month number : ");
         int month = input.nextInt();
         switch (month){
             case 0:
                 System.out.println("jan = 31 days");
                 break;
                 case 1:
                     System.out.println("feb = 28 days");
                     break;
             case 2:
                 System.out.println("march = 30 days");
                 break;
             case 3:
                 System.out.println("april = 31 days");
                 break;
             case 4:
                 System.out.println("may = 30 days");
                 break;
             case 5:
                 System.out.println("june = 31 days");
                 break;
         }
     }
}
