package AppTest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.ProductMapper;

public class Test {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("AppConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession();

        ProductMapper productMapper = session.getMapper(ProductMapper.class);
        System.out.println(productMapper.searchProductByName("a"));

        session.commit();
        session.close();
    }
}
