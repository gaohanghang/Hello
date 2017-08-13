package traintest;

/*
接口没有main()方法，因为我们不能运行它
这句话在JDK1.8之前是对的
1.8之后就不对了
 */
public interface handy {
    static final int i=99;

    default void beautiful()
    {
        System.out.println("  ");
    }
    public static void girl()
    {

    }
    public static void main(String[] args) {
        System.out.println("我是handy接口的main方法，当你看见我出现时，说明那个博客错了=-=");
    }
}
