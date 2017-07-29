package day07;

class Person{
    String name;
    static String country="CN";
    public void show()
    {
        System.out.println(country+":"+name);
    }
}
/*
static的特点：
1,static是一个修饰符，用于修饰成员。
2,static修饰的成员被所有的对象所共享。
3,static优先于对象存在，因为static的成员随着类的加载就已经存在了。
4,static修饰的成多了一种调用方式，就是可以直接被类名所调用。 类名.静态变量。
5,static修饰的是共享数据，对象中存储的是特有数据。

 */
public class StaticDemo {
    public static void main(String[] args) {

        Person p=new Person();
//        p.name="小强";
//        p.show();

        System.out.println(p.country);
        System.out.println(Person.country);
    }
}
