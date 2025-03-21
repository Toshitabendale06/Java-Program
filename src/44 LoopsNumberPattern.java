 class LoopsNumberPattern {
     public static void main(String[] args) {
         int i,j ,count=0;
                 for(i=1 ; i<=5 ; i++){
                     for(j=1 ; j<=i ; j++){
                         System.out.print(" "+j);
                     }
                     System.out.println();
                 }
         System.out.println("its is an another pattern");
             for(i=1 ; i<=5 ; i++){
                 for(j=1 ; j<=i ; j++){
                     System.out.print(" "+i);
                 }
                 System.out.println();
             }
         System.out.println("its is an another pattern");
         for(i=1 ; i<=4 ; i++){
             for(j=1 ; j<=i ; j++){
                  count++;
                 System.out.print(" "+count);
             }
             System.out.println();
         }
     }
}
