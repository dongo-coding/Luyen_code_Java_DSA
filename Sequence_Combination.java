import java.util.Scanner;

public class Sequence_Combination {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int a[]=new int [100005];
        int b[]=new int [100005];
        int c[]=new int [100005];

        int m,n;

        n=sc.nextInt();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();

        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        int size=0;
        int i=0,j=0;

        while (i<n && j<m){
            if (a[i]<b[j]){
                c[size++]=a[i++];
            }
            else {
                c[size++]=b[j++];
            }
        }
        while (i<n){
            c[size++]=a[i++];
        }
        while (j<m){
            c[size++]=b[j++];
        }
        for(int k=0;k<size;k++){
            System.out.print(c[k]+" ");
        }
    }
}
