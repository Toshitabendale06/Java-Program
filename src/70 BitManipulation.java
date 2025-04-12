import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

class BitManipulation {
    public static void main(String[] args) {
        //Get bit
        int n = 5;  //0101
        int pos = 3;
        int bitmask = 1 << pos;  //1000
        if ((bitmask & n) == 0) {   //1000 & 0101 =0000
            System.out.println("get bit = bit was zero");  //bit was zero
        } else {
            System.out.println("get bit = bit was one");
        }

        //Set bit
        int n2 = 5;  //0101
        int pos2 = 1;
        int bitmask2 = 1 << pos2;   //0010
        int newnumber = bitmask2 | n2;  //0010 | 0101 =0111 =7
        System.out.println("set bit = " + newnumber);

                          //clear bit (zero bana dena)
        //clear the 3rd bit(positon == 2) of a number n.(n=0101)
        //1.bit mask : 1<<i  ---->left shift operator
        //2.operation : And with Not
        int n3 = 5;  //0101
        int pos3 = 2;
        int bitmask3 = 1 << pos3;   //0100
        int notBitmask = ~(bitmask3);  //0100 ---->1011

        int newnumber3 = notBitmask & n3;   //1011 & 0101 ---> 0001
        System.out.println("Clear bit = "+newnumber3);

                       //Update Bit
        //update the 2nd bit(position =1)of a number n to 1.(n=0101)
        //    For 0                       For 1
        //Bit Mask : 1<<i            Bit Mask :1<<i
        //operation:And with Not     operation : OR
        Scanner sc = new Scanner(System.in);
        System.out.println("\tUpdate bit");
        System.out.print("Enter the operation: ");
        int oper = sc.nextInt();
        //oper=0 :set    oper=1 : clear
        int n4 =5;
        int pos4 =1;
        //update bit to 1 else update bit to 0
        //set operation
        int bitMask4 = 1<<pos4;
        if(oper==1){
            int newnumber4 = bitMask4 | n4;
            System.out.println(newnumber4);
        }
        else{
            int newbitmask = ~(bitMask4);
            int newnumber4 = newbitmask & n4;
            System.out.println(newnumber4);
        }
    }
}
