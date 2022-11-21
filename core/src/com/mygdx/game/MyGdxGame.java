package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.utils.ScreenUtils;

public abstract class MyGdxGame extends ApplicationAdapter implements Menu {
//
//	Animation animation;
//	Object reg;
//	float stateTime;
//	abc
	private Texture Loading1;
	private Texture Loading2;
	private Texture Loading3;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Sprite sprite;
	private SpriteBatch spriteBatch;
	private BitmapFont font;
	private TextureRegion textureRegion;
	private TextureRegion textureRegion2;
	private float stateTime;
	private Object reg;
	private Animation animation;

	public MyGdxGame() {
//		this.animation = animation;
//		reg = animation.getKeyFrame(0);
	}

	@Override
	public void act(float delta) {
		stateTime += delta;
		reg = animation.getKeyFrame(stateTime);
	}
	public void draw(SpriteBatch batch, float parentAlpha) {
		batch.draw((Texture) reg, getX(), getY());
	//}
	int count=1;
		class MainMenuScreen extends MyGdxGame {

			private MyGdxGame game;

			@Override
			protected float getY() {
				return 0;
			}

			@Override
			protected float getX() {
				return 0;
			}

			@Override
			public void render(float delta) {
				ScreenUtils.clear(0, 0, 0.2f, 1);

				camera.update();
				game.batch.setProjectionMatrix(camera.combined);

				game.batch.begin();
				game.font.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
				game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
				game.batch.end();

				if (Gdx.input.isTouched()) {
					game.setScreen(new GameScreen(game));
					dispose();
				}
			}

//		spriteBatch = new SpriteBatch();
//		font = new BitmapFont(true);
//		camera = new OrthographicCamera();
//
//
//
//		Loading2 = new Texture(Gdx.files.internal("Screen2.png"));
//		textureRegion2 = new TextureRegion(Loading2);
//		textureRegion2.flip(false, true);
//
//		camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
}

//		Gdx.gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//		camera.update();
//		spriteBatch.setProjectionMatrix(camera.combined);
//
//		spriteBatch.begin();
//		//font.draw(spriteBatch, "Hacking Time", 0, 0);
//		spriteBatch.draw(textureRegion2, 0, 0);
//	//	spriteBatch.draw(textureRegion, 250, 370);
//
//		spriteBatch.end();
//
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

	public abstract void render(float delta);

	protected abstract float getX();

	protected abstract float getY();

	private void setScreen(GameScreen gameScreen) {

	}
}









