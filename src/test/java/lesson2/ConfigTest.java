package lesson2;

import lesson2.camera.Camera;
import lesson2.camera.CameraImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("lesson2")
public class ConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        Camera camera = context.getBean("cameraImpl", Camera.class);
    }
}
