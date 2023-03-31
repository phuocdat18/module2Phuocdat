package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<student, String> map = new HashMap<>();

    }
    public static void mapBasic() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Thi Thi");
        map.put(2, "HCB");
        map.put(3, "Phap");

        System.out.println(map.get(3));
        System.out.println(map.containsKey(5));

        Set<Integer> keys = map.keySet();
        for (Integer item : keys) {
            System.out.println(map.get(item));
        }
    }

}