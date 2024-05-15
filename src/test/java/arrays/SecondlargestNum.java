package arrays;
public class SecondlargestNum {
    public static void main(String[] args) {
       int a[]={32,12,43,48,92,13,1};
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]<a[j]){
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
           }
       }System.out.println(a[1]);
       for(Integer t:a){
       System.out.println(t);
    }
    }
}