import com.fan.config.fanConfig;
import com.fan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(fanConfig.class);
        User getUser = (User) context.getBean("user");
        System.out.println(getUser.toString());

    }
}
