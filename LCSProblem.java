import java.util.Scanner;

public class LCSProblem
{
    public static void main(String[] args)
    {
        //保留空字符串是为了getLength()方法的完整性也可以不保留
        //但是在getLength()方法里面必须额外的初始化c[][]第一个行第一列
        String[] x = {"", "A", "B", "C", "B", "D", "A", "B"};  //之所以要空出第一行（列），是因为c【】【】里面意思是两个字符数组分别多少个，0的意思就是某个串长度为0
        String[] y = {"", "B", "D", "C", "A", "B", "A"};

        int[][] b = getLength(x, y);

        Display(b, x, x.length-1, y.length-1);
    }

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x1 = sc.next();
        String y1 = sc.next();
        getLCS(x1,y1);
    }

    public static void getLCS(String x1, String y1){

        char[] x = x1.toCharArray();
        char[] y = y1.toCharArray();
        int[][] array = new int[x1.length()+1][y1.length()+1];//此处的棋盘长度要比字符串长度多加1，需要多存储一行0和一列0

        for(int j = 0; j < array[0].length; j++){//第0行第j列全部赋值为0
            array[0][j] = 0;
        }
        for(int i = 0; i < array.length; i++){//第i行，第0列全部为0
            array[i][0] = 0;
        }

*/        /**
         * @param x
         * @param y
         * @return 返回一个记录决定搜索的方向的数组
         */
    public static int[][] getLength(String[] x, String[] y)
    {
        int[][] b = new int[x.length][y.length];
        int[][] c = new int[x.length][y.length];

        for(int i=1; i<x.length; i++)
        {
            for(int j=1; j<y.length; j++)
            {
                //对应第一个性质
                if( x[i] == y[j])
                {
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = 1;
                }
                //对应第二或者第三个性质
                else if(c[i-1][j] >= c[i][j-1])
                {
                    c[i][j] = c[i-1][j];
                    b[i][j] = 0;
                }
                //对应第二或者第三个性质
                else
                {
                    c[i][j] = c[i][j-1];
                    b[i][j] = -1;
                }
            }
        }

        return b;
    }
    //回溯的基本实现，采取递归的方式
    public static void Display(int[][] b, String[] x, int i, int j)
    {
        if(i == 0 || j == 0)
            return;

        if(b[i][j] == 1)
        {
            Display(b, x, i-1, j-1);
            System.out.print(x[i] + " ");
        }
        else if(b[i][j] == 0)
        {
            Display(b, x, i-1, j);
        }
        else if(b[i][j] == -1)
        {
            Display(b, x, i, j-1);
        }
    }
}