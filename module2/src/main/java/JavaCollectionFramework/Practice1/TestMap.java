package JavaCollectionFramework.Practice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Đạt", 24);
        hashMap.put("Thi", 23);
        hashMap.put("Bằng", 28);
        System.out.println("Hiển thị các danh mục trong HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Hiển thị các danh mục trong TreeMap");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Đạt", 24);
        linkedHashMap.put("Thi", 23);
        linkedHashMap.put("Bằng", 28);
        System.out.println("\n Tuổi của " + "Lewis is " + linkedHashMap.get("Lewwis") );
    }

}
