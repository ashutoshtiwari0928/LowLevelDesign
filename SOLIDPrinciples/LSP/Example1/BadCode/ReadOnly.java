package SOLIDPrinciples.LSP.Example1.BadCode;

public class ReadOnly implements File{
    @Override
    public void read() throws UnsupportedOperationException {
        System.out.println("Reading File");
    }

    @Override
    public void write() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void edit() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported.");
    }
}
