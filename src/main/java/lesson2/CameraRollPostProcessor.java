package lesson2;

import lesson2.camera.roll.BlackWhiteCameraRoll;
import lesson2.camera.roll.ColorCameraRoll;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CameraRollPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        if (bean instanceof BlackWhiteCameraRoll) {
            bean = new ColorCameraRoll();
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        return bean;
    }
}
