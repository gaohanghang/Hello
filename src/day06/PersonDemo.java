package day06;

/*
人：
属性：
    年龄。
行为：
    说话。
 */
class Person {
    int age;

    void speak() {
        System.out.println("age=" + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.age=20;
        p.speak();
    }
}
