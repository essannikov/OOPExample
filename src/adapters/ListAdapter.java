package adapters;

public class ListAdapter implements BetaList{
    private AlphaList alphaList;

    public ListAdapter(AlphaList alphaList) {
        this.alphaList = alphaList;
    }

    @Override
    public int getValue(int index) {
        return alphaList.get(index);
    }

    @Override
    public void setValue(int index, int value) {
        alphaList.set(index, value);
    }

    @Override
    public int getSize() {
        return alphaList.getData().size();
    }
}
