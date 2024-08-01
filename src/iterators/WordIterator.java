package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordIterator implements Iterator<Word.WordPart> {
    private Word word;
    private int wordPartsCount;

    public WordIterator(Word word) {
        this.word = word;
        this.wordPartsCount = word.getPartCount();
    }

    @Override
    public boolean hasNext() {
        switch (this.wordPartsCount){
            case 4:
                return this.word.hasPrefix() || this.word.hasRoot() ||
                        this.word.hasSuffix() || this.word.hasEnding();
            case 3:
                return this.word.hasPrefix() || this.word.hasRoot() ||
                        this.word.hasSuffix();
            case 2:
                return this.word.hasPrefix() || this.word.hasRoot();
            case 1:
                return this.word.hasRoot();
        }

        return false;
    }

    @Override
    public Word.WordPart next() throws NoSuchElementException {
        if (this.wordPartsCount <= 0){
            throw new NoSuchElementException("No more elements in this word!");
        }

        try{
            switch (this.wordPartsCount){
                case 4:
                    return this.word.getEnding();
                case 3:
                    return this.word.getSuffix();
                case 2:
                    return this.word.getRoot();
            }
            return this.word.getPrefix();
        } finally {
            this.wordPartsCount--;
        }
    }
}
