package oop.oop;

public class ChildClass extends ParentClass{
    public ChildClass(String val) {
        super(val);
    }

    @Override
    public String getVal() {
        return super.getVal();
    }

    protected void setVal(String val) {
        //super.setVal(val);
    }
}
