import javax.swing.*;
import java.awt.*;

public class Entity extends JLabel{
    private int width, height, speed;

    Entity() {
        super();
    }

    void setWidth(int width) { this.width = width; }

    void setHeight(int height) { this.height = height; }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }


}
