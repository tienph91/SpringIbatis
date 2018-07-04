package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Student;

public interface StudentMapper {

    @Select("Select * From Student")
    List<Student> getListAllStudent();

    @Select("Select * From Student Where ID = #{id}")
    Student getStudentById(int id);

    @Delete("Delete From Student Where ID = #{id}")
    void deleteStudentById(int id);

    @Insert("Insert Into Student Values(#{id}, #{name}, #{age}, #{address}, #{gpa})")
    void insertStudent(Student student);

    @Update("Update Student Set name = #{name}, age = #{age}, phone = #{phone} Where id = #{id}")
    void updateStudent(Student student);
}
