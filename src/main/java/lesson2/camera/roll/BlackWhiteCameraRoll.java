package lesson2.camera.roll;

import lesson2.annotation.UnproductableCameraRoll;
import org.springframework.stereotype.Component;

@Component(BlackWhiteCameraRoll.NAME)
@UnproductableCameraRoll(usingCameraRollClass = ColorCameraRoll.class)
public class BlackWhiteCameraRoll implements CameraRoll{

    final public static String NAME = "blackWhiteCameraRoll";

    public void processing() {
        System.out.println("Black white frame is done.");
    }
}
