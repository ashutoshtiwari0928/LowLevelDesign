package DesignPatterns.ObjectCreationalPatterns.Singleton;

public class Application {
    public static void main(String[] args) {
        LazySingleton a = LazySingleton.getInstance();
        LazySingleton b = LazySingleton.getInstance();
        System.out.println(a.hashCode()+" "+b.hashCode());

        ThreadSafeSingleton c = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton d = ThreadSafeSingleton.getInstance();
        System.out.println(c.hashCode()+" "+d.hashCode());

        DoubleCheckedSingleTon e = DoubleCheckedSingleTon.getInstance();
        DoubleCheckedSingleTon f = DoubleCheckedSingleTon.getInstance();
        System.out.println(e.hashCode()+" "+f.hashCode());

        EagerInitialization g = EagerInitialization.getInstance();
        EagerInitialization h = EagerInitialization.getInstance();
        System.out.println(g.hashCode()+" "+h.hashCode());

        BillPugh i = BillPugh.getInstance();
        BillPugh j = BillPugh.getInstance();
        System.out.println(i.hashCode()+" "+j.hashCode());
    }
}
