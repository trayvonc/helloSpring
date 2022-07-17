import com.fan.mapper.UserMapper;
import com.fan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {
//        String resources="mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList=mapper.selectUser();
//        for(User user:userList){
//            System.out.println(user.toString());
//        }
//        sqlSession.close();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> userList=userMapper.selectUser();
        for(User user:userList){
            System.out.println(user.toString());
        }
    }
}
