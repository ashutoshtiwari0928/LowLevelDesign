package DesignPatterns.ObjectCreationalPatterns.Singleton;

public class DoubleCheckedSingleTon {
    private volatile static DoubleCheckedSingleTon instance;
    private DoubleCheckedSingleTon(){}
    public static DoubleCheckedSingleTon getInstance(){
        if(instance==null) {
            synchronized (DoubleCheckedSingleTon.class) {
                if(instance==null) {
                    instance = new DoubleCheckedSingleTon();
                }
            }
        }
        return instance;
    }
}
