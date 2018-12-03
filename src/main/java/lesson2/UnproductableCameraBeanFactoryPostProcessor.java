package lesson2;

import lesson2.annotation.UnproductableCamera;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class UnproductableCameraBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);

            String className = beanDefinition.getBeanClassName();

            try {
                Class<?> beanClass = Class.forName(className);

                UnproductableCamera anntotation = beanClass.getAnnotation(UnproductableCamera.class);
                if (anntotation != null) {
                    beanDefinition.setBeanClassName(anntotation.usingCameraClass().getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
