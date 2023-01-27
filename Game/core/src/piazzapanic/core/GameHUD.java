package piazzapanic.core;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameHUD {

    public Stage stage;
    private Viewport viewport;
    private Integer timeCount;
    private float timer;
    Label timeLabel;
    Label scoreLabel;

    GameHUD(SpriteBatch sb){

        this.timeCount = 0;
        this.timer = 0;

        this.viewport = new FitViewport(Main.width, Main.height, new OrthographicCamera());
        this.stage = new Stage(this.viewport, sb);

        // Table organises the labels in the stage
        Table table = new Table();
        table.top();
        // table is the size of the stage
        table.setFillParent(true);

        this.timeLabel = new Label("TIME", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        this.scoreLabel = new Label(String.format("%d", this.timeCount), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        this.timeLabel.setFontScale(3f);
        this.scoreLabel.setFontScale(3f);

        // Add the labels to the table
        table.add(this.timeLabel).expandX().padTop(10);
        table.row();
        table.add(this.scoreLabel).expandX().padTop(10);

        // Add the table to the stage
        this.stage.addActor(table);

    }

    public void update(float dt){
        this.timer += dt;
        // If 1 second has passed
        if(this.timer >= 1){
            this.timeCount++;
            this.scoreLabel.setText(String.format("%d", this.timeCount));
            this.timer = 0;
        }
    }

}
