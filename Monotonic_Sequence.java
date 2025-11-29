import java.util.Scanner;

public class Monotonic_Sequence{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        int n;

        int a[]= new int [100];

        n=sc.nextInt();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean kt = true;

        if (n>2){
            for(int i=2;i<n;i++){
                if((a[i]-a[i-1]) * (a[i-1] - a[i-2]) <=0){
                kt=false;
                }
            }
        }
        if (kt) System.out.print("YES");
        else System.out.print("NO");
    }
}
