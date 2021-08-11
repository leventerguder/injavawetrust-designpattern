package demo.v2;

public class Art implements Subject {

    private String[] papers;

    public Art() {
        this.papers = new String[]{"English", "History",
                "Geography", "Psychology"};
    }

    @Override
    public ArtIterator createIterator() {
        return new ArtIterator(papers);
    }
}
