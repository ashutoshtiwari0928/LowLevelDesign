package SOLIDPrinciples.LSP.Example1;

import SOLIDPrinciples.LSP.Example1.BadCode.File;
import SOLIDPrinciples.LSP.Example1.BadCode.ReadWriteOnly;

public class Main {
    public static void main(String[] args) {
        File readWrite = new ReadWriteOnly();
        readWrite.read();
        readWrite.write();
        readWrite.edit();
    }
}
