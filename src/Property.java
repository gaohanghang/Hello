/**
 * Created by 高行行 on 2017/7/8.
 */

import java.util.*;

public class Property {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = "+rt.totalMemory()+"Free Memory = "+rt.freeMemory());
        try{
            Thread.currentThread().sleep(5*1000);
        }catch (InterruptedException e){}

    }
}
