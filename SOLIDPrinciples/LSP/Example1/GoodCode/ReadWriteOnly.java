package SOLIDPrinciples.LSP.Example1.GoodCode;

public class ReadWriteOnly implements Editable,Readable {
    @Override
    public void edit() {
        System.out.println("edit");
    }

    @Override
    public void read() {
        System.out.println("read");
    }
}
