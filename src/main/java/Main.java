import config.AppConfig;
import models.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User vasya = new User();
        vasya.setEmail("frostpv@gmail.com");
        vasya.setName("Vasya");
        userService.add(vasya);
        User ira = new User();
        ira.setEmail("irina@gmail.com");
        ira.setName("Irina");
        userService.add(vasya);
    }
}
