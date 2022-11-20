package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


//test
public class MyGdxGame extends ApplicationAdapter {
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
	//	Loading1=new Texture(Gdx.files.internal("Loading1.png"));
		//camera = new OrthographicCamera();
		//camera.setToOrtho(false, 800, 480);
//		batch = new SpriteBatch();
//		sprite=new Sprite(Loading1);
//		sprite=new Sprite(Loading2);
//		sprite=new Sprite(Loading3);

		spriteBatch = new SpriteBatch();
		font = new BitmapFont(true);
		camera = new OrthographicCamera();

		Loading1 = new Texture(Gdx.files.internal("Bar1.png"));
		textureRegion = new TextureRegion(Loading1);
		textureRegion.flip(false, true);

		Loading2 = new Texture(Gdx.files.internal("Loading2.png"));
		textureRegion2 = new TextureRegion(Loading2);
		textureRegion2.flip(false, true);

		camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render() {
//		ScreenUtils.clear(0, 0, 0.2f, 1);
//		batch.begin();
//		sprite.draw(batch);
//		batch.end();

		Gdx.gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		spriteBatch.setProjectionMatrix(camera.combined);

		spriteBatch.begin();
		//font.draw(spriteBatch, "Hacking Time", 0, 0);
		spriteBatch.draw(textureRegion2, 0, 0);
		spriteBatch.draw(textureRegion, 250, 370);
//		spriteBatch.draw(textureRegion, 64, 0);
//		spriteBatch.draw(textureRegion, 96, 0);
//		spriteBatch.draw(textureRegion, 128, 0);
//		spriteBatch.draw(textureRegion, 160, 0);
//		spriteBatch.draw(textureRegion, 192, 0);
//		spriteBatch.draw(textureRegion, 224, 0);
		spriteBatch.end();

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
