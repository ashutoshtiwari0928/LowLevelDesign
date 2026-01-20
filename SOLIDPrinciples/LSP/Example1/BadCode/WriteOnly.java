package SOLIDPrinciples.LSP.Example1.BadCode;

public class WriteOnly implements File{
    @Override
    public void read() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void write() throws UnsupportedOperationException {
        System.out.println("Writing File");
    }

    @Override
    public void edit() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported.");
    }
}
