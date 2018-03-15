package 单例模式.懒汉式2;

//单例模式之懒汉模式-2
public class Singleton {

    //创建对象引用不实例化 并且设置为私有静态成员变量
    // 使用volatile 保证变量的可见性
    private static volatile Singleton instance;

    private Singleton(){
    }

    //使用synchronized保证多线程操作时候线程安全
    public  Singleton getInstance(){
        // 对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
        if (instance == null) {
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (Singleton.class) {
                //未初始化，则初始instance变量
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}