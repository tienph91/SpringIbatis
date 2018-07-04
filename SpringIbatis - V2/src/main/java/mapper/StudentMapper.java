package mapper;

import java.util.List;

import entity.Student;

public interface StudentMapper {
    int insert(Student student);

    int update(Student student);

    int deleteById(int id);

    List<Student> selectAll();

    Student selectById(int id);
}
