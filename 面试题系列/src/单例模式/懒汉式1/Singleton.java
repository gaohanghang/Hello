package 单例模式.懒汉式1;

//单例模式之懒汉模式-1
public class Singleton {

    //创建对象引用不实例化 并且设置私有静态成员变量
    private static Singleton instance;

    private Singleton(){

    }

    //使用synchronized保证多线程操作时候线程安全
    public synchronized Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
