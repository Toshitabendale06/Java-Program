 class FindBiggestElement_Arrays {
     public static void main(String[] args) {
         int a[] ={20,40,1,4,50};
         int max =a[0];  //max=20 ,max=50
         for(int i=1 ; i<a.length ; i++){  //i=1,2,3,4
             if(a[i]>max){   //40>20 ,1>40 ,4>40 ,50>40
                 max = a[i];   //max =40 ,50
             }
         }
         System.out.println("Greatest element: "+max);

     }
}
