import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0, sIndex = 0;
        while (gIndex < g.length && sIndex < s.length) {
            if (g[gIndex] <= s[sIndex])
                gIndex++;
            sIndex++;
        }
        return gIndex;
    }

    public static void main(String[] args) {
        int[] g={2,3};
        int[] s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
