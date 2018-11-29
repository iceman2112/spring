package homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gun {
    @Autowired
    @Qualifier(BulletSilver.NAME)
    private Bullet bullet;

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet fire() {
        return bullet;
    }
}
