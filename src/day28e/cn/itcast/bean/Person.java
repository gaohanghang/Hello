package day28e.cn.itcast.bean;

public class Person {

    private int age;
    private String name;

    public Person(int age,String name){
        super();
        this.age = age;
        this.name = name;

        System.out.println("Person param run..."+this.name+":"+this.age);
    }
    public Person(){
        super();
        System.out.println("Person run");
    }

    public void show(){
        System.out.println(name+"...show run..."+age);
    }

    public void method(){
        System.out.println(" method run ");
    }

    public void paramMethod(String str,int num){
        System.out.println("paramMethod run...."+str+":"+num);
    }
}
