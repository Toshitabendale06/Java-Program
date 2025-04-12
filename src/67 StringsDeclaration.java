import java.util.Scanner;

class StringsDeclaration {
     public static void main(String[] args) {
//         string declaration
         String name ="Toshita";
         String sentence = "My name is toshita bendale";
         //concat method
         System.out.println(name.concat(sentence));
         //length() method
         System.out.println(name+" length is: "+name.length());
         //charAt() method
         for(int i=0 ;i<name.length() ; i++) {
             System.out.print(name.charAt(i)+" ");
         }
         System.out.println();
         //compare
         String fruits1 = "mango";
         String fruits2 = "mango";
         if(fruits1 == fruits2){
             System.out.println("equal");
         }else{
             System.out.println("not equal");
         }
         System.out.println();
         //user se string lenge
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your full name : ");
         String Fullname = input.nextLine();
         System.out.println("your name is "+Fullname);

     }
}
