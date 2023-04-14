package ExamModule2.service;

import ExamModule2.model.Student;
import ExamModule2.utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;
public class StudentService implements IStudentService {
    List<Student> students = new ArrayList<>();
    private static String path = "src/main/java/ExamModule2/data/student.csv";

    @Override
    public List<Student> getItem() {
        List<Student> newProducts = new ArrayList<>();
        List<String> records = CSVUtils.read(path);
        for (String record : records) {
            newProducts.add(new Student(record));
        }
        return students = newProducts;
    }

    @Override
    public void addItem(Student newStudent) {
        List<Student> students = getItem();
        students.add(newStudent);
        CSVUtils.write(path, students);
    }

    @Override
    public void update(Student newStudent) {
        List<Student> students = getItem();
        for (Student student : students) {
            if (student.getId() == newStudent.getId()) {
                student.setName(newStudent.getName());
                student.setTuoi(newStudent.getTuoi());
                student.setGioitinh(newStudent.getGioitinh());
                student.setDiachi(newStudent.getDiachi());
                student.setDiemTB(newStudent.getDiemTB());
            }
        }
        CSVUtils.write(path, students);
    }

    @Override
    public void update(int id, Student updateStudent) {

    }

    @Override
    public void remove(long id) {
        List<Student> students = getItem();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
        CSVUtils.write(path, students);
    }

    @Override
    public boolean exists(int id) {
        return getStudentByID(id) != null;
    }

    @Override
    public Student getStudentByID(int id) {
        List<Student> students = getItem();
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}