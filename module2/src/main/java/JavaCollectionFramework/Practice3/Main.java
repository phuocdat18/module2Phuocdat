package JavaCollectionFramework.Practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Đạt", 24, "NT");
        Student student2 = new Student("Thi", 23, "H");
        Student student3 = new Student("Bằng", 28, "SG");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
