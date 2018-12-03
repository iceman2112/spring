package lesson2.cameraRoll;

import org.springframework.stereotype.Component;

@Component
public class ColorCameraRoll implements CameraRoll {
    public void processing() {
        System.out.println("Color frame is done.");
    }
}
