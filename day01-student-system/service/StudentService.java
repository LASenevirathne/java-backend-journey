package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {
    
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
}
