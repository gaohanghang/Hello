package day13;


/*
多线程下的单例

 */
//饿汉式
class Single
{
    private static final Single s=new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}
//懒汉式
class Single2
{
    private static Single2 s=null;
    private Single2(){}
    public static Single2 getInstance()
    {
        if (s==null){   //这个判断时解决效率问题
            synchronized(Single.class){   //this.getclass()是非静态的  加锁是解决安全问题
                if (s==null)
//                -->0  -->1
                    s=new Single2();

            }
        }
        return s;
    }
}
public class SingleDemo {
    public static void main(String[] args) {
        System.out.println();
    }
}
