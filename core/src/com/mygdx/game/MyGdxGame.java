package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.graphics.g2d.Animation;
import org.w3c.dom.Text;

public class MyGdxGame extends Actor implements ApplicationListener {

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

	@Override
	public void create() {
		Texture Loading1;
		Texture Loading2;

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}
