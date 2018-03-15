package 抽象类;

/**
 * 抽象类是否可以new对象
 *
 * 抽象类
 *      1.抽象类不可以new对象
 *
 */
public abstract class A {

    public static void main(String[] args) {
//        new A();
        A a =  new Aimpl();
    }
}
