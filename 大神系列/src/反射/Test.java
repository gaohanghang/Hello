package 反射;

public class Test {
    public static void main(String[] args) {
        try {
            Class clz = Class.forName("反射.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
