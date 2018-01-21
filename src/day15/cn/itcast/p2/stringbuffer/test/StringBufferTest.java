package day15.cn.itcast.p2.stringbuffer.test;

/**
 * @author 高行行
 */
public class StringBufferTest {
    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 3, 9};
        String s = arrayToString_2(arr);

        System.out.println(s);
    }

    public static String arrayToString_2(int[] arr) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i] + ",");
            } else {
                sb.append(arr[i]+"]");
            }
        }
        return sb.toString();
    }

    /**
     * 将一个int数组变成字符串。
     */
    public static String arrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ",";
            } else {
                str += arr[i] + "]";
            }
        }
        return str;
    }
}
