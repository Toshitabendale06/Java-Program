import java.util.Arrays;

//compare Arrays
                  //1. ==    2.equals()
class Compare_Arrays {
     public static void main(String[] args) {
         int a[] ={10,20,30,40};
         int a2[]={10,20,30,40};
         if(a==a2){
             System.out.println("Both are equals //they are not because a and a2 are different");
         }else if(a==a){
             System.out.println("both are equals because they are same refrals a = a if it is a=a2 then it is not equal");
         }else{
             System.out.println("Both are not equal");
         }
         if(Arrays.equals(a,a2)){
             System.out.println("Both are equals");
         }else{
             System.out.println("Both are not equal");
         }
     }
}
