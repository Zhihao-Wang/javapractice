import static java.lang.Math.sqrt;

public class Youya {
    public static int youya(int n){
        int count=0;
        double r=sqrt(n);
        for(int i=0;i<=r;i++){
            for(int j=0;j<r;j++){
                if(i*i+j*j==n){
                    count++;

                }
            }
        }
            return count*4;
    }

    public static void main(String[] args) {
        System.out.println(youya(1));
    }
}
