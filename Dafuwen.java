import java.util.*;
public class Dafuwen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(fun(n));
        }
        sc.close();
    }
    public static int fun(int n){
        int count=0;
        if(n==1)
            count=1;
        else if(n==2)
            count=2;
        else{
            for(int i=1;i<n;i++){
                count+=fun(n-i);
            }
            count=count+1;
        }
        return count;
    }

}