package 面试题.面试题系列1;

/**
 * float f = 3.14 是否正确
 */
public class Test1 {
    public static void main(String[] args) {
        float f = (float) 3.14; //可向下造型 downcasting
        float f1 = 3.14f;
        float f3 = 3.14F;

        float f4 = (float) 3.14;
    }

}
