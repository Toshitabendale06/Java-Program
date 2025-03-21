import java.util.Scanner;

class ArmstrongNum {
     public static void main(String[] args) {
         //153 is armstrong number
         // number of digit = 3 so
         // 1*1*1 + 5*5*5 + 3*3*3 =153
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number : ");
         int num = input.nextInt();
         int rem , mul=0 ,c =num;
         while(num > 0){
             rem =num%10;
             mul = (rem*rem*rem)+mul;
             num=num/10;
         }
         if(c == mul){
             System.out.println("Armstrong number");
         }else{
             System.out.println("Armstrong not number");
         }
     }
}
