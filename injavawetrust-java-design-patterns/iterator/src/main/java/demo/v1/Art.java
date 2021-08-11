package demo.v1;

public class Art implements Subject {

    private String[] papers;

    public Art() {
        this.papers = new String[]{"English", "History",
                "Geography", "Psychology"};
    }

    @Override
    public Iterator createIterator() {
        return new ArtIterator(papers);
    }
}
