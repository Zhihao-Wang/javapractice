public class NumOf1 {
    public static int NumOf1(int n) {
        int count = 0;
        while (n>0) {
            count++;
            n = (n-1)&n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumOf1(11));
    }

}
