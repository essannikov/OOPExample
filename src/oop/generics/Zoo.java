package oop.generics;

public class Zoo<CatType extends Cat> {
    CatType cat;

    public CatType getCat() {
        return cat;
    }

    public void setCat(CatType cat) {
        this.cat = cat;
    }

    public String getCatName(){
        return this.cat.getName();
    }
}
