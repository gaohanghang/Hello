package day11;


/*
Object:所有类的根类。

Objct是不断抽取而来，具备所有对象都具备的共性内容。

常用的共性功能：


 */
/*
class Fu2//extends Object
{
    Fu2()
    {
        super();
    }
}
class Zi2 extends Fu2
{
    Zi2()
    {
        super();
    }
}
*/
class Person extends Object
{
    private int age;
    Person(int age)
    {
        this.age=age;
    }
    /*
    //比较Person的年龄，是否是同龄人
    public boolean compare(Person p)
    {
        return this.age==p.age;
    }
    */
    /*
    一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据。
     */
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Person)){
//            return false;
            throw new ClassCastException("类型错误");
        }
        Person p=(Person)obj;
        return this.age==p.age;//Object obj=p2;
    }
    /*
    public int hashCode()
    {
        return age;
    }
    */
    public String toString()
    {
        return "Person :"+age;
    }


}
class Demo2
{

}
public class ObjectDemo {
    public static void main(String[] args) {
        Person p1=new Person(20);
        Person p2=new Person(20);
        Demo d=new Demo();
//        System.out.println(p1.equals(p2));

//        System.out.println(p1);
//        System.out.println(Integer.toHexString(p1.hashCode()));
//
//        Class clazz1=p1.getClass();
//        Class clazz2=p2.getClass();
//        System.out.println(clazz1==clazz2);
//        System.out.println(clazz1.getName());

        System.out.println(p1);//day11.Person@1540e19d
        System.out.println(p1.getClass().getName()+"$"+Integer.toHexString(p1.hashCode()));//day11.Person$1540e19d

//        Person p3=p1;

//        Demo2 d=new Demo2();

//        System.out.println(p1==p2);//比较的是两个对象。
//        System.out.println(p1.equals(p2));
    }
}
