public class DataStr implements Comparable<DataStr> {
    public String name;
    public String adress;
    public Integer count;

    public DataStr(String name, String adress, Integer count) {
        this.name = name;
        this.adress = adress;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int compareTo(DataStr o) {
        return this.getCount() - o.getCount();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", count=" + count;
    }
}
