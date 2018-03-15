package 大哥面试题.单例模式;

public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
}
