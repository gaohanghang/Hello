package 面试题.面试题系列4;

import java.util.Arrays;

public class MyArraylist {
    private Object[] objs = new Object[10]; //定义数组，初始化长度是10
    private int index = 0; //数组下标

    /**
     * 添加
     *@param o
     */
    public void add(Object o){
        if (index == objs.length){
            // 扩容
            extend();
        }
        objs[index++] =o;
    }

    /**
     * 根据下标获取对象
     * @param index 下标
     * @return
     */
    public Object get(int index){
        return objs[index];
    }

    /**
     * 计算元素个数
     * @return
     */
    public int size(){
        int size = 0;
        for (int i = 0; i < objs.length; i++) {
            if(objs[i]!=null){
                size++;
            }
        }
        return size;
    }

    /**
     * 清空
     */
    public void clear(){
        for (int i = 0; i < objs.length; i++) {
            objs[i] = null;
        }
    }

    /**
     * 判断是否包含
     * @param o
     * @return
     */
    public boolean contains(Object o){
        for (int i = 0; i < objs.length; i++) {
            if(o!=null&&o.equals(objs[i])){
                return true;
            }
        }
        return false;
    }

    /**
     * 根据下标删除
     */
    public void remove(int index){
        if (index<0 || index>= this.size()){
            System.out.println("下标无效，无法删除。。。");
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < objs.length; i++) {
            objs[i] = objs[i+1];
            if (i==this.size()){
                break;
            }
        }
    }

    /**
     * 根据对象删除
     * @param o
     */
    public void remove(Object o){
        int index = getIndexByObject(o);
        remove(index);
    }

    /**
     * 根据对象获取对象的下标
     * @return
     */
    public int getIndexByObject(Object o){
        for (int i = 0; i < objs.length; i++) {
            if(o!=null&&o.equals(objs[i])){
                return i;
            }
        }
        return -1;
    }

    /**
     * 自定义迭代器
     */
    public MyIterator iterator(){
        return new Iterator();
    }

    class Iterator implements MyIterator{
        private int size = 0;
        @Override
        public boolean hasNext() {
            if(objs[size]!=null) return true;
            else return false;
        }

        @Override
        public Object next() {
            size++;
            return objs[size-1];
        }
    }




    /**
     * 扩容
     */
    private void extend(){
        Arrays.copyOf(objs,objs.length+1);
    }


}
