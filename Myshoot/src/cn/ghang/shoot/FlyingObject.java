package cn.ghang.shoot;

import java.util.Random;

/**
 * 飞行物
 */
public abstract class FlyingObject {
    //对象的声明周期
    public static final int LIFE = 0; //活着的
    public static final int DEAD = 1; //死了的（但没有删除呢）
    public static final int REMOVE = 2; //
    protected int state = LIFE; //

    protected int width; //
    protected int height;
    protected int x;
    protected int y;

    /**
     *
     */
}
