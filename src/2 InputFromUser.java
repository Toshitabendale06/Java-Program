import java.util.Scanner;

class InputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c=a*b;
        System.out.println("Multiplication of two number is " +c );
    }


}
