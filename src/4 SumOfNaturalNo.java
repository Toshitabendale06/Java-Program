import java.util.Scanner;

class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = input.nextInt();
        isnaturalnumber(num);
    }

    public static void isnaturalnumber(int num) {
        int sum = 0;
        for(int i=1 ; i<=num ; i++){
             sum = sum + i;
        }
        System.out.println(sum);
    }

}