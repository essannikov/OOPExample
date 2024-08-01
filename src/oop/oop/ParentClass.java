package oop.oop;

import java.io.IOException;
import java.util.Objects;

public abstract class ParentClass {
    private String val = "";

    public ParentClass(String val) {
        this.val = val;
    }

    public String getVal(){
        return val;
    }

    public String getVal(String tmp) {
        return val + tmp;
    }

    private void setVal(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParentClass)) return false;
        ParentClass that = (ParentClass) o;
        return getVal().equals(that.getVal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVal());
    }
}
