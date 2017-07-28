package object;

//:object/ShowProperties.java
//显示可用参数

/**
 * Created by 高行行 on 2017/7/14.
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));
    }
}
