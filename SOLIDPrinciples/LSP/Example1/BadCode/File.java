package SOLIDPrinciples.LSP.Example1.BadCode;

public interface File {
    void read() throws UnsupportedOperationException;
    void write() throws UnsupportedOperationException;
    void edit() throws UnsupportedOperationException;
}
