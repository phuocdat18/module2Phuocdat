package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class student {
    public static void main(String[] args) {
        Map<student, String> map = new HashMap<>();

        Set<student> keys = map.keySet();
    }
    public static void mapBasic() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Thi Thi");
        map.put(2, "HCB");
        map.put(3, "Phap");

//        System.out.println(map.get(3));
//        System.out.println(map.containsKey(5));

        Set<Integer> keys = map.keySet();
        for (Integer item : keys) {
            System.out.println(map.get(item));
        }
    }

    public student() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
