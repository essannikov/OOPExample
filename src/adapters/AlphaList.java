package adapters;

import java.util.ArrayList;

public interface AlphaList {
    boolean add(Integer value);
    boolean remove(int index);
    Integer get(int index);
    boolean set(int index, Integer value);

    ArrayList getData();
}
