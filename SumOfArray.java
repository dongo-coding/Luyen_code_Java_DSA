import java.util.Scanner;
public class Bai1{
    public static void main (String []args){
        int n;
        int a[]= new int [101];

        Scanner sc = new Scanner (System.in);

        n=sc.nextInt();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int S=0;
        for(int i=0;i<n;i++){
            S+=a[i];
        }
        System.out.print(S);
    }
}
