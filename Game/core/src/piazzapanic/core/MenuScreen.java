package piazzapanic.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MenuScreen implements Screen {

    private Viewport viewport;
    private Stage stage;
    private Main game;
    private int difficulty;
    private Label stageModeLabel;
    private Label startGameLabel;


    public MenuScreen(Main game){
        this.game = game;
        this.viewport = new StretchViewport(this.game.width, this.game.height, new OrthographicCamera());
        this.stage = new Stage(viewport, this.game.batch);
        this.difficulty = 5;

        // scenario mode
        Label.LabelStyle font = new Label.LabelStyle(new BitmapFont(), Color.WHITE);

        Table table = new Table();
        table.center();
        //take up the entire stage
        table.setFillParent(true);

        this.stageModeLabel = new Label("Stage Mode " + "(" +this.difficulty + ")", font);
        this.startGameLabel = new Label("Click to Play", font);
        stageModeLabel.setFontScale(4f);
        startGameLabel.setFontScale(3f);

        table.add(stageModeLabel).expandX();
        table.row();
        table.add(startGameLabel).expandX().padTop(10f);

        stage.addActor(table);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        // Start the game
        if(Gdx.input.justTouched()){
            game.setScreen(new GameScreen(game));
            dispose();
        }
        // if A then change difficulty
        else if(Gdx.input.isKeyJustPressed(Input.Keys.A)){
            this.difficulty -= 1;
            System.out.println(this.difficulty);
            this.stageModeLabel.setText("Stage Mode " + "(" +this.difficulty + ")");
        }

        ScreenUtils.clear(0, 0, 0, 1);
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
