package homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Gun gun = context.getBean(Gun.class);
    }
}
