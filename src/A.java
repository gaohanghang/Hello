
/*
面试题
答案为login
 */
public class A {
    private String host=""; //内存地址A
    private String api="login"; //内存地址B
    private String service=host+api;  //开辟新的内存空间，内存地址c,类成员变量初始化为login

    public A setHost(String host){
        this.host=host;
        return this;
    }
    public String getService(){
        return this.service;
    }

    public static void main(String[] args) {
        String host_="127.0.0.1";   //127.0.0.1 指向地址D,set修改后的host地址为D
        System.out.println(new A().setHost(host_).getService()); //变量service所指向的内存地址始终没有发生变化
                                                          //因为String是final类型，每次修改实际为重新开辟了新的空间
    }
}
