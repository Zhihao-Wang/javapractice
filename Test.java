public class Test {
    public static void main(String[] args) {
        Object object = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(object.equals("hello"));
    }
}
