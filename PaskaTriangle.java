import java.util.ArrayList;
import java.util.List;

public class PaskaTriangle {
    public static void main(String[] args) {

        System.out.println(generate(5));

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> thisRow = new ArrayList<Integer>(i);

            for (int j = 0; j <= i; j++) {
                if(j==0)
                    thisRow.add(1);
                else{
                    if(j<i)
                        thisRow.add( result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                    else if(j==i)
                        thisRow.add(1);
                }

            }
            result.add(thisRow);
        }
        return result;
    }

}
