package Test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Student;

public class Test {

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("ConfigApp.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = sqlSessionFactory.openSession();
        
        Student student = session.selectOne("Student1.readRecordById", 2);

        System.out.println(student);
        
        session.commit();
        session.close();
    }

}
