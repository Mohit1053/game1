package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame implements ApplicationListener {
//
//	Animation animation;
//	Object reg;
//	float stateTime;
	private Texture Loading1;
	private Texture Loading2;
	private Texture Loading3;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Sprite sprite;

//	public MyGdxGame() {
//		this.animation = animation;
//		reg = animation.getKeyFrame(0);
//	}
//
//	@Override
//	public void act(float delta) {
//		stateTime += delta;
//		reg = animation.getKeyFrame(stateTime);
//	}
//	public void draw(SpriteBatch batch, float parentAlpha) {
//		batch.draw((Texture) reg, getX(), getY());
	//}

	@Override
	public void create() {
//		Loading1=new Texture(Gdx.files.internal("Loading1.jpg"));
//		Loading2=new Texture(Gdx.files.internal("Loading2.jpg"));
		Loading1=new Texture(Gdx.files.internal("Loading1.png"));
		//camera = new OrthographicCamera();
		//camera.setToOrtho(false, 800, 480);
		batch = new SpriteBatch();
		sprite=new Sprite(Loading1);
//		sprite=new Sprite(Loading2);
//		sprite=new Sprite(Loading3);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
		ScreenUtils.clear(0, 0, 0.2f, 1);
		batch.begin();
		sprite.draw(batch);
		batch.end();

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
		batch.dispose();
		Loading1.dispose();
//		Loading2.dispose();
//		Loading3.dispose();

	}
}
