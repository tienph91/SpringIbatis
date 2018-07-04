package mapper;

import java.util.List;

import entity.Student;

public interface StudentMapper {

    List<Student> getListAllStudent();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void insertStudent(Student student);

    void updateStudent(Student student);
}
