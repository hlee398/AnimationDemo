

import java.awt.*;
import java.util.*;

import processing.core.PImage;
//mario is litt
public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
		super.moveByAmount(dir*8, 0);
	}

	public void jump() {
		// JUMP!
		//Codedededdeded
	}

	public void act(ArrayList<Shape> obstacles) {
		this.moveByAmount(0, 10);
	}


}
