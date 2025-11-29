import java.util.Scanner;

public class CheckArray {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int a[]= new int[100005];

        int b[]= new int[100005];

        int n;
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int Max_val=a[0];

        for(int i=0;i<n;i++){
            if (a[i]>Max_val){
                Max_val=a[i];
            }
        }

        for(int i=0;i<=Max_val;i++){
            b[i]=0;
        }

        for(int i=0;i<n;i++){
            b[a[i]] +=1;
        }

        for(int i=0;i<=Max_val;i++){
            if(b[i]>0){
                System.out.print(i+" - "+b[i]+"; ");
            }
        }

    }
}
