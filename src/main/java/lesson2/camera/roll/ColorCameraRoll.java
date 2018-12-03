package lesson2.camera.roll;

import org.springframework.stereotype.Component;

@Component(ColorCameraRoll.NAME)
public class ColorCameraRoll implements CameraRoll {

    final public static String NAME = "colorCameraRoll";

    public void processing() {
        System.out.println("Color frame is done.");
    }
}
