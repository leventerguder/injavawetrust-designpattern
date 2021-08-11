package demo.v2;

import java.util.Iterator;

public class ArtIterator implements Iterator<String> {


    private String[] papers;
    private int position;

    public ArtIterator(String[] papers) {
        this.papers = papers;
        position = 0;
    }


    public void first() {
        position = 0;
    }

    public String currentItem() {
        return papers[position];
    }

    @Override
    public boolean hasNext() {
        if (position >= papers.length)
            return false;
        return true;
    }

    @Override
    public String next() {
        return papers[position++];
    }
}
