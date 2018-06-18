public class Fibo {
    public static  long fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        long FibN=0;
        long Fibone=0;
        long Fibtwo=1;
        for(int i=2;i<=n;i++){
            FibN=Fibone+Fibtwo;
            Fibone=Fibtwo;
            Fibtwo=FibN;
        }
        return FibN;
    }

    public static void main(String[] args) {

        System.out.println(  fibo(2));

    }
}
