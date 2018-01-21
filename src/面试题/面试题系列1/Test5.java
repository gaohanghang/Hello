package 面试题.面试题系列1;

public class Test5 {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.x); //20
    }

}

class Base{
    int x = 10; //3

    public Base(){ //2
        this.printMessage(); //4
        x = 20; //6
    }

    public void printMessage() {
        System.out.println("Base.x="+x);
    }
}

class Sub extends Base {
    int x = 30; //7

    public Sub(){ //1
        this.printMessage(); //8
        x = 40; //10
    }

    @Override
    public void printMessage() {
        System.out.println("Sub.x="+x); //5 Sub.x=0 //9 Sub.x=30
    }

}


