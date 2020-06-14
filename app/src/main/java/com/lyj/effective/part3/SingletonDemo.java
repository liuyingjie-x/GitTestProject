package com.lyj.effective.part3;

public class SingletonDemo {
    private static SingletonDemo SINGLETON_DEMO = new SingletonDemo();
    private static SingletonDemo instance;
    private static volatile SingletonDemo instanceReal;

    private SingletonDemo() {

    }

    /**
     * 饿汉式
     *
     * @return
     */
    public static SingletonDemo getInstance() {
        return SINGLETON_DEMO;
    }

    /**
     * 枚举
     */
    public enum Test {
        INTANCE, ASSIT;
    }

    /**
     * 最差劲的懒汉式，不建议用
     *
     * @return
     */
    public static SingletonDemo getInstance5() {
        if (null == instance) {
            return new SingletonDemo();
        }
        return instance;
    }

    /**
     * 懒汉式DCL「双重检测锁:Double Checked Lock」 单例（假），因为instance创建不是原子性操作
     * 1、SingletonDemo实例分配内存
     * 2、调用SingletonDemo构造函数，初始化成员变量
     * 3、将instance对象指向分配的内存空间
     *
     * @return
     */
    private static SingletonDemo getInstance2() {
        if (null == instance) {
            synchronized (SingletonDemo.class) {
                if (null == instance) {
                    return new SingletonDemo();
                }
            }
            return new SingletonDemo();
        }
        return instance;
    }

    /**
     * 懒汉式升级版DCL「双重检测锁:Double Checked Lock」 单例（真）
     * volatile关键字能保证可见性和有序性
     * synchronized关键字能保证原子性、可见性和有序性
     *
     * @return
     */
    private static SingletonDemo getInstance4() {
        if (null == instanceReal) {
            synchronized (SingletonDemo.class) {
                if (null == instanceReal) {
                    return new SingletonDemo();
                }
            }
            return new SingletonDemo();
        }
        return instanceReal;
    }


    /**
     * 静态内部类
     */
    private static class SingletonInstance {
        private static final SingletonDemo instance = new SingletonDemo();
    }

    private static SingletonDemo getInstance3() {
        return SingletonInstance.instance;
    }


}
