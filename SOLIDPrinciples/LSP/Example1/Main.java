package SOLIDPrinciples.LSP.Example1;

//import SOLIDPrinciples.LSP.Example1.BadCode.File;
//import SOLIDPrinciples.LSP.Example1.BadCode.ReadWriteOnly;
//import SOLIDPrinciples.LSP.Example1.GoodCode.File;
import SOLIDPrinciples.LSP.Example1.GoodCode.ReadWriteOnly;

public class Main {
    public static void main(String[] args) {
        ReadWriteOnly file = new ReadWriteOnly();
        file.read();
        file.edit();
    }
}
