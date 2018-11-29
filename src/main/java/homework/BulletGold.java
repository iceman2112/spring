package homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(BulletGold.NAME)
public class BulletGold implements Bullet {
    final public static String NAME = "bulletGold";
}
