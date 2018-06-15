import java.util.Scanner;

public class Toutiao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2,m;
        n1=in.nextInt();
        n2=in.nextInt();
        m=in.nextInt();
        int[] a=new int[n1];
        int[] b=new int[n2];
        int[] dp=new int[m+1];
        for(int i=0;i<n1;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n2;i++)
            b[i]=in.nextInt();
        for(int i=0;i<n1;i++){
            for(int j=a[i];j<=m;j++){
                dp[j]+=dp[j-a[i]];
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=m;j>=b[i];j--){
                dp[j]+=dp[j-b[i]];
            }
        }
        System.out.println(dp[m]);
    }
}
