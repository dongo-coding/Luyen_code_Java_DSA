import java.util.Scanner;

public class Insertk_x {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int n,k,x;
        
        n=sc.nextInt();
       

        int a[]= new int[100];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         k=sc.nextInt();
         x=sc.nextInt();

         for(int i=n;i>k;i--){
            a[i]=a[i-1];
         }

         a[k]=x;
         n++;

         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }





    }
}
