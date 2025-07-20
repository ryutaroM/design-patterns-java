package Adapter;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string); // calling parent constructor
    }

    @Override
    public void printWeak() {
        showWithParen(); // using Banner's method
    }

    @Override
    public void printStrong() {
        showWithAster(); // using Banner's method
    }
}
