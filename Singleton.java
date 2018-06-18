public class Singleton {
   private static class SingletonHolder{
       public static final Singleton instance= new Singleton();
    }
    public static Singleton getInstance(){
       return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        Singleton one=Singleton.getInstance();
        Singleton two=Singleton.getInstance();
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
    }
}


