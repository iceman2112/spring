package xmlconfig;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MegaBean megaBean = context.getBean(MegaBean.class);
        TestBean testBean = context.getBean(TestBean.class);
        TestCase.assertEquals(megaBean, testBean.getMegaBean());
    }
}
