//package day12;
//
//class Demo extends Thread{
//
//    private String name;
//    Demo(String name){
//        super();
//        this.name = name;
//    }
//    @Override
//    public void run() {
//
//        for (int x = 0; x <10 ; x++) {
//            System.out.println("...x="+x+".....name="+Thread.currentThread().getName());
//        }
//    }
//}
//
//public class ThreadDemo3 {
//    public static void main(String[] args) {
//
//        Demo d1 = new Demo("旺财");
//        Demo d2 = new Demo("xiaoqiang");
//        d1.start();
//
//        d2.start();
//
//        System.out.println(4/0);//throw  ArithmeticException
//
//        for (int x = 0; x <20 ; x++) {
//            System.out.println(x+"..."+Thread.currentThread().getName());
//        }
//
//    }
//}
