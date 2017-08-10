package day12.mypack;

import day12.packa.DemoA;
import day12.packb.DemoB;

/*
包与包之间的类进行访问，被访问的包中的类必须是public的，被访问的包中的类的也必须是public的。
protected 保护
default 默认
private 私有的
        public      protected       default     private
同一类中  ok            ok             ok          ok
同一包中  ok            ok             ok
子类中    ok            ok
不同包中  ok

导包的原则：用到哪个类，就导入哪个类。

import 干嘛用的啊？为了简化类名书写。
 */
public class PackageDemo {
    public static void main(String[] args) {
        DemoA d=new DemoA();
        d.show();

//        DemoB b=new DemoB();
//        b.method();
        System.out.println("hello world");
    }
}
