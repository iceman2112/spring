package lesson2;

import lesson2.cameraRoll.CameraRoll;

public interface Camera {
    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhotograph();
    void breaking();
    boolean isBroken();
}
