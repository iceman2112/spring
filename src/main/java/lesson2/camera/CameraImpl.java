package lesson2.camera;

import lesson2.camera.roll.BlackWhiteCameraRoll;
import lesson2.camera.roll.CameraRoll;
import lesson2.camera.roll.ColorCameraRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("camera")
public class CameraImpl implements Camera {

    @Autowired
    @Qualifier(BlackWhiteCameraRoll.NAME)
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean isBroken;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        if (isBroken) {
            System.out.println("Camera is broken.");
        } else {
            System.out.println("Photo is done.");
            cameraRoll.processing();
        }
    }

    public void breaking() {
        this.isBroken = true;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
