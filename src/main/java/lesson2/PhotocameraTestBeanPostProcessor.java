package lesson2;

import lesson2.camera.Camera;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PhotocameraTestBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        // Находим бин класса фотокамеры
        if(bean instanceof Camera){
            System.out.println("Делаю пробное фото!");
            // Делаем пробное фото
            ((Camera) bean).doPhotograph();
            System.out.println("Отлично! Работает!");
        }
        return bean;
    }
}
