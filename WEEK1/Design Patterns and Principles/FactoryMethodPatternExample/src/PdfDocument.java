public class PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("opening the word file..");
    }

    @Override
    public void close() {
        System.out.println("Closing the word file..");
    }
}
