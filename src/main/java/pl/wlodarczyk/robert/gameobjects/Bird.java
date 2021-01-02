package pl.wlodarczyk.robert.gameobjects;

import pl.wlodarczyk.robert.loaders.GraphicsLoader;
import pl.wlodarczyk.robert.supers.Animation;
import pl.wlodarczyk.robert.supers.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Bird extends GameObject {

    Animation animation;

    public Bird(int x, int y, int width, int height) {
        super(x, y, width, height);

        BufferedImage[] images = new BufferedImage[3];

        for (int i = 0; i < images.length; i++) {
            images[i] = GraphicsLoader.loadGraphics("bird" + i + ".png");

        }

        animation = new Animation(this, 300, true, images);
        animation.start();

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }
}
