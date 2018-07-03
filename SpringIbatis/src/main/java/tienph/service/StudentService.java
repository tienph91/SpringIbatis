package tienph.service;

import java.util.List;
import tienph.entity.Student;

public interface StudentService {
    public int insertStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudentById(int studentId);

    public List<Student> selectAllStudent();

    public Student selectStudentById(int studentId);
}
