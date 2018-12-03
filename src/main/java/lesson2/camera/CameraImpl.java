package lesson2;

import lesson2.cameraRoll.CameraRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("camera")
public class CameraImpl implements Camera {

    @Autowired
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
