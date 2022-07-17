import com.fan.service.UserService;
import com.fan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理返回的是一个接口
        UserService userService = (UserService) context.getBean("userService");
        userService.select();
    }
}
