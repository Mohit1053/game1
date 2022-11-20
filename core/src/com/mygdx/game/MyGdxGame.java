package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.graphics.g2d.Animation;

public class MyGdxGame extends Actor {

	Animation animation;
	Object reg;
	float stateTime;

	public MyGdxGame() {
		this.animation = animation;
		reg = animation.getKeyFrame(0);
	}

	@Override
	public void act(float delta) {
		stateTime += delta;
		reg = animation.getKeyFrame(stateTime);
	}
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw((Texture) reg, getX(), getY());
	}
}
