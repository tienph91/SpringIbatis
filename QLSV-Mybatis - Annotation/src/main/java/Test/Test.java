package Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Student;
import mapper.StudentMapper;

public class Test {

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("ConfigApp.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = sqlSessionFactory.openSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        List<Student> listStudent = studentMapper.getListAllStudent();

        for (Student student : listStudent) {
            System.out.println(student);
        }

        int id = 1;
        Student studentTemp = studentMapper.getStudentById(id);
        System.out.println(studentTemp);

        id = 3;
        studentMapper.deleteStudentById(id);

        // insertStudent
        Student studentInser = new Student("PhamHoangTien", 17, "Hoa Binh", 9);
        studentMapper.insertStudent(studentInser);

        System.out.println("------------------------------------------");
        listStudent = studentMapper.getListAllStudent();

        for (Student student : listStudent) {
            System.out.println(student);
        }

        session.commit();
        session.close();
    }

}
