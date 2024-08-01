package adapters;

import java.util.ArrayList;

public class AlphaListClass implements AlphaList{
    private ArrayList<Integer> arrayList;

    public AlphaListClass() {
        arrayList = new ArrayList<>();
    }

    @Override
    public boolean add(Integer value) {
        return arrayList.add(value);
    }

    @Override
    public boolean remove(int index) {
        try{
            arrayList.remove(index);
            return true;
        }catch (Exception exception){
        }

        return false;
    }

    @Override
    public Integer get(int index) {
        try{
            return arrayList.get(index);
        }catch (Exception exception){
        }

        return null;
    }

    @Override
    public boolean set(int index, Integer value) {
        try{
            arrayList.set(index, value);
            return true;
        }catch (Exception exception){
        }

        return false;
    }

    @Override
    public ArrayList getData() {
        return arrayList;
    }
}
