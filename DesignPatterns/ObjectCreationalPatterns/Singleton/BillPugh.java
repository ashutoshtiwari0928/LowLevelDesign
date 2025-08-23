package DesignPatterns.ObjectCreationalPatterns.Singleton;

public class BillPugh {
    private BillPugh(){}
    private static class singletonHelper{
        public static final BillPugh instance = new BillPugh();
    }
    public static BillPugh getInstance(){
        return singletonHelper.instance;
    }
}
