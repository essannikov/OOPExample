package iterators;

import java.util.Iterator;

public class Word implements Iterable<Word.WordPart>{
    private Root root;
    private Prefix prefix;
    private Suffix suffix;
    private Ending ending;
    private int partCount;

    public Word(Root root, Prefix prefix, Suffix suffix, Ending ending) {
        this.root = root;
        this.prefix = prefix;
        this.suffix = suffix;
        this.ending = ending;
        this.partCount = 4;
    }

    public Word(Root root, Prefix prefix, Suffix suffix) {
        this.root = root;
        this.prefix = prefix;
        this.suffix = suffix;
        this.partCount = 3;
    }

    public Word(Root root, Prefix prefix) {
        this.root = root;
        this.prefix = prefix;
        this.partCount = 2;
    }

    public Word(Root root) {
        this.root = root;
        this.partCount = 1;
    }

    public Root getRoot() {
        return root;
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public Suffix getSuffix() {
        return suffix;
    }

    public Ending getEnding() {
        return ending;
    }

    public int getPartCount() {
        return partCount;
    }

    public boolean hasRoot(){
        return this.root != null;
    }

    public boolean hasPrefix(){
        return this.prefix != null;
    }

    public boolean hasSuffix(){
        return this.suffix != null;
    }

    public boolean hasEnding(){
        return this.ending != null;
    }

    public interface WordPart{
        String getWordPart();
    }

    public static class Root implements WordPart{
        private String part;

        public Root(String part) {
            this.part = part;
        }

        @Override
        public String getWordPart() {
            return this.part;
        }
    }

    public static class Prefix implements WordPart{
        private String part;

        public Prefix(String part) {
            this.part = part;
        }

        @Override
        public String getWordPart() {
            return this.part;
        }
    }

    public static class Suffix implements WordPart{
        private String part;

        public Suffix(String part) {
            this.part = part;
        }

        @Override
        public String getWordPart() {
            return this.part;
        }
    }

    public static class Ending implements WordPart{
        private String part;

        public Ending(String part) {
            this.part = part;
        }

        @Override
        public String getWordPart() {
            return this.part;
        }
    }

    @Override
    public Iterator<WordPart> iterator() {
        return new WordIterator(this);
    }
}
