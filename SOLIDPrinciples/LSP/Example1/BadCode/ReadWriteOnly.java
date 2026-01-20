package SOLIDPrinciples.LSP.Example1.BadCode;

public class ReadWriteOnly implements File{
    @Override
    public void read() throws UnsupportedOperationException {
        System.out.println("Reading file.");
    }

    @Override
    public void write() throws UnsupportedOperationException {
        System.out.println("Writing file.");
    }

    @Override
    public void edit() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported.");
    }
}
