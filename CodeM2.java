import java.util.Scanner;

public class CodeM2 {
    public static void main(String[] args) {

        int n,m,k;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        k=in.nextInt();
        int[] a= new int[k];
        int[] b=new int[k];
        for (int i = 0; i < k; i++) {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        int index=0;
        double p=1.0*m/n;
        double ans=0;
        for(int i=0;i<k;i++){
            double curren=p*a[i]+(1.0-p)*b[i];
            if(curren>ans){
                ans=curren;
                index=i;
            }
        }
        for(int i=0;i<k;i++){
            if(i==index)
                System.out.print(n+" ");
            else
                System.out.print(0+" ");
        }
    }
}
