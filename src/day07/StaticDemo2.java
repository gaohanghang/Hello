package day07;

class Person {
    private String name;
    private int age;
    static String country = "CN";
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public  void show()
    {
        System.out.println(Person.country + ":"+this.name+":"+this.age);
    }
    public static void method()
    {
        System.out.println(Person.country);
    }
}
public class StaticDemo2 {
    public static void main(String[] args) {
        Person.method();
        Person p=new Person("java",20);
        p.show();
    }

}

