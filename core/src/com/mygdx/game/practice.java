//package com.mygdx.game;
//
//public class practice {
//
//    @Override
//    public void create () {
//
//        spriteBatch = new SpriteBatch();
//        font = new BitmapFont(true);
//        camera = new OrthographicCamera();
//
//        texture = new Texture(Gdx.files.internal("cable_side.png"));
//        textureRegion = new TextureRegion(texture);
//        textureRegion.flip(false, true);
//
//        texture2 = new Texture(Gdx.files.internal("cable_l_1.png"));
//        textureRegion2 = new TextureRegion(texture2);
//        textureRegion2.flip(false, true);
//
//        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//
//
//    }
//
//    @Override
//    public void render () {
//
//
//        Gdx.gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//        camera.update();
//        spriteBatch.setProjectionMatrix(camera.combined);
//
//        spriteBatch.begin();
//        //font.draw(spriteBatch, "Hacking Time", 0, 0);
//        spriteBatch.draw(textureRegion2, 0, 0);
//        spriteBatch.draw(textureRegion, 32, 0);
//        spriteBatch.draw(textureRegion, 64, 0);
//        spriteBatch.draw(textureRegion, 96, 0);
//        spriteBatch.draw(textureRegion, 128, 0);
//        spriteBatch.draw(textureRegion, 160, 0);
//        spriteBatch.draw(textureRegion, 192, 0);
//        spriteBatch.draw(textureRegion, 224, 0);
//        spriteBatch.end();
//    }
//}
