package baitap20Cau.Q30.Q18.comparable;

public class Q18 implements Comparable {
    private int id;
    private String name;

    public Q18(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer compareTo(Q18 comparestu) {
        int compareage=((Q18)comparestu).getId();
        return this.id-compareage;
    }

    @Override
    public String toString() {
        return "Q18{" + "name='" + name + ", id=" + id + "}";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
