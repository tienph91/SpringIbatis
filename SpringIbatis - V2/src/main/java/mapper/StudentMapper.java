package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.Student;

public interface StudentMapper {
    int insert(Student student);

    int update(Student student);

    int deleteById(int id);

    @Select("select * from student")
    List<Student> selectAll();

    Student selectById(int id);
}
