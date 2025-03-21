import java.util.Scanner;

class CalPowerOfNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power to calculate: ");
        int power = input.nextInt();

        int c = 1 ;
        for(int i=1 ; i<=power ; i++){
            c = num * c;
        }
        System.out.println(c);
    }

}

