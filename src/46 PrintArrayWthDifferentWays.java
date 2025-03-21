

class PrintArrayWthDifferentWays {
     public static void main(String[] args) {
         int a[] = new int[3];
         a[0] = 10;
         a[1] = 20;
         a[2] = 30;
         //this is the first method to print  an array
         for(int i=0 ; i<3 ; i++){
             System.out.print(a[i]+" ");
         }

         System.out.println();

         //there are two method to print the array
         //this is for each method and this is the best method to print an array
         for(int b : a){
             System.out.print(b+" ");
         }
     }
}
