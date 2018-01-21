package day12;

/*
多线程下的单例
 */

// 饿汉式
class Single{
    private static final Single s = new Single();
    private Single(){}
    public static Single getInstance(){
        return  s;
    }
}

// 懒汉式
/*
加锁是为了解决线程安全问题
加判断是为了解决效率问题
 */
//class Single{
//    private static Single s = null;
//
//    private Single(){}
//
//    public static Single getInstance(){
//        if(s==null){
//            synchronized (Single.class){
//                if (s==null){
//                    s = new Single();
//                }
//            }
//        }
//    }
//
//}
public class SingleDemo {
}
