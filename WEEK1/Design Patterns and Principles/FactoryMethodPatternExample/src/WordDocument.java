public class WordDocument implements Document{
    @Override
    public void close() {
        System.out.println("Closing the pdf file..");
    }

    @Override
    public void open() {
        System.out.println("Opening the pdf file..");
    }
}
