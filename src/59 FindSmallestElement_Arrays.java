 class FindSmallestElement_Arrays {
     public static void main(String[] args) {
         int a[] = {20,3,1,5,7};
         int min=a[0];  //min=20,min=3,min=1
         for(int i=1 ; i<a.length ; i++){ //i=1,2,3,4
             if(a[i]<min){  //3<20,1<3,5<1,7<1
                 min=a[i];  //3,1,-,-
             }
         }
         System.out.println("Smallest element = "+min);
     }
}
