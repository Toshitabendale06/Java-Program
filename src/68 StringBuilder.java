import java.util.*;
class string {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Tony");
         System.out.println(sb);

         //char at index 0
         System.out.println(sb.charAt(0));

         //set char at index o
         sb.setCharAt(0,'p');
         System.out.println(sb);

         //insert
         sb.insert(2,'n');
         System.out.println(sb);
         sb.insert(0,'s');
         System.out.println(sb);

         //delete
         sb.delete(3,4);
         System.out.println(sb);
         sb.delete(2,4);
         System.out.println(sb);

         //insert element in end
         sb.append("y");
         System.out.println(sb);
         System.out.println(sb.length());
     }
}
