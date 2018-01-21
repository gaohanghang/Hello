package 面试题.面试题系列4;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");


//        System.out.println(list.get(0));
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        list.remove(1);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        //迭代器遍历
//        System.out.println("迭代器遍历：");
//        Iterator itor = list.iterator();
//        while (itor.hasNext()){
//            System.out.println(itor.next());
//        }

        System.out.println("自定义ArrayList:");
        MyArraylist my = new MyArraylist();
        my.add("aaa");
        my.add("bbb");
        my.add("ccc");
        my.add("ddd");

        System.out.println(my.get(1));
        System.out.println(my.size());

        System.out.println("自定义ArrayList集合for循环：");
        for (int i = 0; i < my.size() ; i++) {
            System.out.println(my.get(i));
        }

//        my.clear();
//        System.out.println("测试清空：");
//        for (int i = 0; i < my.size() ; i++) {
//            System.out.println(my.get(i));
//        }
//        System.out.println("清空后的长度"+my.size());


        System.out.println(my.contains("ccc"));

//        my.remove(4);
//        my.remove("dddd");
        System.out.println("测试删除：");
        for (int i = 0; i < my.size(); i++) {
            System.out.println(my.get(i));
        }

        System.out.println("测试自定义的迭代器");
        MyIterator itor = my.iterator();
        while (itor.hasNext()){
            System.out.println(itor.next());
        }

    }
}
