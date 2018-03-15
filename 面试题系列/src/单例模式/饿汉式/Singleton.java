package 单例模式.饿汉式;
//单例模式之饿汉模式
public class Singleton {

    //实例化对象 并且设置为私有静态成员变量
    private static final Singleton instance = new Singleton();

    private Singleton(){

    }

    //外界获取该类对象方法 所以是公有的
    public static Singleton getInstance() {
        return instance;
    }
}
