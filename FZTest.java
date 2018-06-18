import java.util.Scanner;

public class FZTest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int length=sc.nextInt();
            int[] array = new int[length];
            for(int i=0; i<length; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(length);
            System.out.println(array);
        }

    }
}
