package day15.cn.itcast.p1.string.test;


/*
2.一个子串在整串中出现的次数。
"nbaernbaynbauinbaopnba"
思路：
1，要找的子串是否存在，如果存在获取其出现的位置。这个可以使用
2，如果找到了，那么就记录出现的位置并在剩余的字符串中继续找该子串，
而剩余字符串的起始位置是出现位置+子串的长度。
3，以此类推，通过循环完成查找，如果找不到就是-1，并对每次找到用计数器记录。


 */
public class StringTest_2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String str = "nbaernbaynbauinbaopnba";
        String key = "nba";

        int count = getkeyStringCount_2(str,key);
        System.out.println("count="+count);
    }

    public static int getkeyStringCount_2(String str, String key) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(key,index))!=-1){

            index = index + key.length();
            count++;
        }
        return count;
    }

    /**
     * 获取子串在整串出现的次数。
     * @param str
     * @param key
     * @return
     */
    public static int getkeyStringCount(String str, String key) {
        //1.定义计数器。
        int count = 0;

        //2.定义变量记录key出现的位置。
        int index = 0;

        while((index = str.indexOf(key))!=-1){
            str = str.substring(index+key.length());
            count++;
        }
        return count;
    }


}
