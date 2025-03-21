import java.util.Scanner;

class CheckIsPositiveNegative {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the num: ");
         int num = input.nextInt();
         if(num > 0){
             System.out.println("+ve number");
         } else if (num<0) {
             System.out.println("-ve number");
         }else{
             System.out.println("either +ve nor -ve number");
         }
     }
}
