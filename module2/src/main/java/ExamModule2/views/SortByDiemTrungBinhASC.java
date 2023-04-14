package ExamModule2.views;

import ExamModule2.model.Student;
import java.util.Comparator;

public class SortByDiemTrungBinhASC implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.getDiemTB() > o2.getDiemTB())  {
            return 1;
        } else if(o1.getDiemTB() == o2.getDiemTB()){
            return 0;
        }else{
            return -1;
        }
    }
}