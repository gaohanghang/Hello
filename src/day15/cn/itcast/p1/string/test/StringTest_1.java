package day15.cn.itcast.p1.string.test;

/**
 *1.给定一个字符串数组，按照字典顺序进行从小到大的排序。
 * {"nba","abc","cba","zz","qq" ,"haha"}
 *
 * 思路：
 * 1，对数组排序，可以用选择，冒泡都行。
 * 2，for嵌套和比较以及换位。
 * 3，问题：以前排的是整数，比较用的是比较运算符，可是现在是字符串对象。
 *      字符串对象怎么比较呢？对象中提供了用于字符串对象比较的功能。
 */
public class StringTest_1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] arr = {"nba","abc","cba","zz","qq","haha"};

        printArray(arr);
        sortString(arr);
        printArray(arr);
    }

    private static void sortString(String[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i].compareTo(arr[j])>0)
                    swap(arr,i,j);
            }
        }
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]+"]");
        }
        System.out.println();
    }

}