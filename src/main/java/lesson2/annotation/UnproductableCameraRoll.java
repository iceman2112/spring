package lesson2.annotation;

import lesson2.camera.roll.CameraRoll;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UnproductableCameraRoll {
    Class usingCameraRollClass();
}
