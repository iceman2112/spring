package lesson2.camera;

import lesson2.camera.roll.CameraRoll;

public interface Camera {
    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhotograph();
    void breaking();
    boolean isBroken();
}
