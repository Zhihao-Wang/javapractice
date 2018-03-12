import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = new StringBuffer(String.valueOf(n)).reverse().toString();
        int m = Integer.parseInt(str);
        System.out.println(m + n);
    }
}
