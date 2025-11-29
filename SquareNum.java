import java.util.Scanner;

public class SquareNum {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n;

        n=sc.nextInt();
        
        int a[] = new int[100];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            a[i]=a[i]*a[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }

    }
}

