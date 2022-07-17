import com.fan.service.UserService;
import com.fan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) ApplicationContext.getBean("userServiceImpl");
        serviceImpl.getUser();
    }
}
