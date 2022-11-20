package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
//
//	Animation animation;
//	Object reg;
//	float stateTime;
	private Texture Loading1;
	private Texture Loading2;
	private Texture texture;
	private Sprite sprite;
 	private OrthographicCamera camera;
	private SpriteBatch batch;

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
		texture=new Texture(Gdx.files.internal("Loading3.png"));
//		camera = new OrthographicCamera();
//		camera.setToOrtho(false, 800, 480);
		batch = new SpriteBatch();
		sprite=new Sprite(texture);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
		//Gdx.gl.glClearColor(1, 1, 1, 1);
		//Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
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

		texture.dispose();
		batch.dispose();

	}
}
