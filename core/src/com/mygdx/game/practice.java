//package com.mygdx.game;//package com.mygdx.game;
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
//
//
//
//public class MyGdxGame extends ApplicationAdapter {
//    private Stage stage;
//    private Label outputLabel;
//
//    @Override
//    public void create () {
//        stage = new Stage(new ScreenViewport());
//        Gdx.input.setInputProcessor(stage);
//
//        int Help_Guides = 12;
//        int row_height = Gdx.graphics.getWidth() / 12;
//        int col_width = Gdx.graphics.getWidth() / 12;
//
//        Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
//
//        Label title = new Label("Buttons with Skins",mySkin,"big-black");
//        title.setSize(Gdx.graphics.getWidth(),row_height*2);
//        title.setPosition(0,Gdx.graphics.getHeight()-row_height*2);
//        title.setAlignment(Align.center);
//        stage.addActor(title);
//
//        // Button
//        Button button1 = new Button(mySkin,"small");
//        button1.setSize(col_width*4,row_height);
//        button1.setPosition(col_width,Gdx.graphics.getHeight()-row_height*3);
//        button1.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Button");
//                return true;
//            }
//        });
//        stage.addActor(button1);
//
//        // Text Button
//        Button button2 = new TextButton("Text Button",mySkin,"small");
//        button2.setSize(col_width*4,row_height);
//        button2.setPosition(col_width*7,Gdx.graphics.getHeight()-row_height*3);
//        button2.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Text Button");
//                return true;
//            }
//        });
//        stage.addActor(button2);
//
//        // ImageButton
//        ImageButton button3 = new ImageButton(mySkin);
//        button3.setSize(col_width*4,(float)(row_height*2));
//        button3.getStyle().imageUp = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_off.png"))));
//        button3.getStyle().imageDown = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_on.png"))));
//        button3.setPosition(col_width,Gdx.graphics.getHeight()-row_height*6);
//        button3.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Image Button");
//                return true;
//            }
//        });
//        stage.addActor(button3);
//
//        //ImageTextButton
//        ImageTextButton button4 = new ImageTextButton("ImageText Btn",mySkin,"small");
//        button4.setSize(col_width*4,(float)(row_height*2));
//        button4.getStyle().imageUp = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_off.png"))));
//        button4.getStyle().imageDown = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_on.png"))));
//        button4.setPosition(col_width*7,Gdx.graphics.getHeight()-row_height*6);
//        button4.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Image Text Button");
//                return true;
//            }
//        });
//        stage.addActor(button4);
//
//        outputLabel = new Label("Press a Button",mySkin,"black");
//        outputLabel.setSize(Gdx.graphics.getWidth(),row_height);
//        outputLabel.setPosition(0,row_height);
//        outputLabel.setAlignment(Align.center);
//        stage.addActor(outputLabel);
//    }
//
//    @Override
//    public void render () {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        stage.act();
//        stage.draw();
//
//    }
//}
//private float time;
//private int counter=10;
//
//public void update(float delta) {
//        Texture one = new Texture(Gdx.files.internal("Screen1.png"));
//        oneImg = new Image(one);
//        Texture two = new Texture(Gdx.files.internal("Loading2.png"));
//        twoImg = new Image(two);
//        Texture splash = new Texture(Gdx.files.internal("Loading3.png"));
//        splashImg = new Image(splash);
//
//        oneImg.setOrigin(splashImg.getWidth() / 2, splashImg.getHeight() / 2);
//
//        stage.act(delta);
//        counter-=Gdx.graphics.getRawDeltaTime();
//        counter-=delta;
//        if (counter==3)
//        {
//        stage.addActor(oneImg);
//        }
//        else if(counter==2)
//        {
//        stage.addActor(twoImg);
//        }
//        else if(counter==1)
//        {
//        stage.addActor(splashImg);
//        }
//}
//
//
//
//public class Test extends UIScreen {
//    public Test(final MainExecute test) {
//        super();
//        this.test = test;
//    }
//
//    @Override
//    public void show() {
//        stage = new Stage();
//        batch = new SpriteBatch();
//        table = new Table();
//        txture = new createTexture();
//        atlas = new TextureAtlas("atlases/main/unnamed.atlas");
//
//        table.left();
//        table.top();
//        table.setFillParent(true);
//        table.setDebug(true);
//        background = new Texture(Gdx.files.internal("ui elements and skins/Settings screen/Background.png"));
//        Texture up = new Texture(Gdx.files.internal("ui elements and skins/Settings screen/Settings.png"));
//        Drawable upDraw = new TextureRegionDrawable(new TextureRegion(up));
//        Texture down = new Texture(Gdx.files.internal("ui elements and skins/Settings screen/Settings Pressed.png"));
//        Drawable downDraw = new TextureRegionDrawable(new TextureRegion(down));
//
//
//        ImageButton settings = new ImageButton(upDraw, downDraw);
//        table.add(settings).pad(30).expand();
//        this.stage.addActor(table);
//
//        settings.addListener(new ChangeListener() {
//            @Override
//            public void changed(ChangeEvent event, Actor actor) {
//                Gdx.app.exit();
//            }
//        });
//
//    }
//
//    @Override
//    public void render(float delta) {
//        batch.begin();
//        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        batch.end();
//        this.stage.act(delta);
//        this.stage.draw();
//    }
//
//    @Override
//    public void resize(int width, int height) {
//        this.viewport.update(width, height);
//        this.camera.position.set(this.camera.viewportWidth / 2, this.camera.viewportHeight / 2, 0);
//        this.camera.update();
//    }
//
//    @Override
//    public void hide() {
//    }
//
//    @Override
//    public void pause() {
//    }
//
//    @Override
//    public void resume() {
//    }
//
//    @Override
//    public void dispose() {
//    }
//}
//
//
//
//
//
//public class MyGdxGame extends ApplicationAdapter {
//    private Stage stage;
//    private Label outputLabel;
//
//    @Override
//    public void create () {
//        stage = new Stage(new ScreenViewport());
//        Gdx.input.setInputProcessor(stage);
//
//        int Help_Guides = 12;
//        int row_height = Gdx.graphics.getWidth() / 12;
//        int col_width = Gdx.graphics.getWidth() / 12;
//
//        Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
//
//        Label title = new Label("Buttons with Skins",mySkin,"big-black");
//        title.setSize(Gdx.graphics.getWidth(),row_height*2);
//        title.setPosition(0,Gdx.graphics.getHeight()-row_height*2);
//        title.setAlignment(Align.center);
//        stage.addActor(title);
//
//        // Button
//        Button button1 = new Button(mySkin,"small");
//        button1.setSize(col_width*4,row_height);
//        button1.setPosition(col_width,Gdx.graphics.getHeight()-row_height*3);
//        button1.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Button");
//                return true;
//            }
//        });
//        stage.addActor(button1);
//
//        // Text Button
//        Button button2 = new TextButton("Text Button",mySkin,"small");
//        button2.setSize(col_width*4,row_height);
//        button2.setPosition(col_width*7,Gdx.graphics.getHeight()-row_height*3);
//        button2.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Text Button");
//                return true;
//            }
//        });
//        stage.addActor(button2);
//
//        // ImageButton
//        ImageButton button3 = new ImageButton(mySkin);
//        button3.setSize(col_width*4,(float)(row_height*2));
//        button3.getStyle().imageUp = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_off.png"))));
//        button3.getStyle().imageDown = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_on.png"))));
//        button3.setPosition(col_width,Gdx.graphics.getHeight()-row_height*6);
//        button3.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Image Button");
//                return true;
//            }
//        });
//        stage.addActor(button3);
//
//        //ImageTextButton
//        ImageTextButton button4 = new ImageTextButton("ImageText Btn",mySkin,"small");
//        button4.setSize(col_width*4,(float)(row_height*2));
//        button4.getStyle().imageUp = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_off.png"))));
//        button4.getStyle().imageDown = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_on.png"))));
//        button4.setPosition(col_width*7,Gdx.graphics.getHeight()-row_height*6);
//        button4.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Image Text Button");
//                return true;
//            }
//        });
//        stage.addActor(button4);
//
//        outputLabel = new Label("Press a Button",mySkin,"black");
//        outputLabel.setSize(Gdx.graphics.getWidth(),row_height);
//        outputLabel.setPosition(0,row_height);
//        outputLabel.setAlignment(Align.center);
//        stage.addActor(outputLabel);
//    }
//
//    @Override
//    public void render () {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        stage.act();
//        stage.draw();
//
//    }
//}
//
//public class practice {
//    public void UIScreen() {
//        //Initialising camera and adding viewport
//        camera = new OrthographicCamera();
//        viewport = new FitViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), camera);
//        viewport.apply();
//        //Camera position, watching for full screen
//        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
//        camera.update();
//        //Adding the viewport to the stage
//        stage = new Stage(new ScreenViewport(new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight())));
//        stage.setDebugAll(true);
//        Gdx.input.setInputProcessor(stage);
//
//    }
//}


//
//public class MainMenuScreen implements Screen {
//
//    //public MainMenuScreen(final Drop game)....
//
//    @Override
//    public void render(float delta) {
//        ScreenUtils.clear(0, 0, 0.2f, 1);
//
//        camera.update();
//        game.batch.setProjectionMatrix(camera.combined);
//
//        game.batch.begin();
//        game.font.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
//        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
//        game.batch.end();
//
//        if (Gdx.input.isTouched()) {
//            game.setScreen(new GameScreen(game));
//            dispose();
//        }
//    }