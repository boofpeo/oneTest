package com.zhangyu.oneTest.code.designMode.Singleton;


public class Singleton {
//    private enum SingletonEnum{
//        INSTANCE;
//        private Singleton singleton = null;
//        private SingletonEnum(){
//            singleton = new Singleton();
//        }
//        private Singleton getInstance(){
//            return singleton;
//        }
//    }
//    public static Singleton getInstance(){
//        return SingletonEnum.INSTANCE.getInstance();
//    }

    private static volatile Singleton singleton = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton ==null){
            synchronized(Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
