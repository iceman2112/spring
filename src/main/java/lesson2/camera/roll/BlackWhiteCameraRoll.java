package lesson2.cameraRoll;

import org.springframework.stereotype.Component;

@Component
public class BlackWhiteCameraRoll implements CameraRoll{
    public void processing() {
        System.out.println("Black white frame is done.");
    }
}
