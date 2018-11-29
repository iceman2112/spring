package xmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "megaBean")
    public MegaBean megaBean() {
        return new MegaBean();
    }

    @Bean(name = "testBean")
    public TestBean testBean(MegaBean megaBean) {
        return new TestBean(megaBean);
    }
}
