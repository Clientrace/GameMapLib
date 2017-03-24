package GameMapLib.States;

import GameMapLib.Main.MapHandler;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class Test extends BasicGameState {
    @Override
    public int getID() {
        return 0;
    }

    private MapHandler map;

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        map = new MapHandler("resources/tileset.png","resources/map.json",32);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame stateBasedGame, Graphics g) throws SlickException {
        map.render(g,0,0);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {

    }
}
