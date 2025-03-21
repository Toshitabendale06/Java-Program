 class LoopsCharactersPattern {    public static void main(String[] args) {
     char i,j ,count='A';
     for(i='A' ; i<='E' ; i++){
         for(j='A' ; j<=i ; j++){
             System.out.print(" "+j);
         }
         System.out.println();
     }
     System.out.println("its is an another pattern");
     for(i='A' ; i<='E' ; i++){
         for(j='A' ; j<=i ; j++){
             System.out.print(" "+i);
         }
         System.out.println();
     }
     System.out.println("its is an another pattern");
     for(i='A' ; i<='E' ; i++){     //A=65  E=69
         for(j='A' ; j<=i ; j++){
             System.out.print(" "+count );
             count++;
         }
         System.out.println();
     }
 }

}
