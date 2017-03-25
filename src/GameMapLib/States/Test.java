package GameMapLib.States;

import GameMapLib.Main.GameMap;
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

    private GameMap map;

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        map = new GameMap("resources/tileset.png","resources/map.json",20);
        CharHandler.init();
    }

    @Override
    public void render(GameContainer gc, StateBasedGame stateBasedGame, Graphics g) throws SlickException {
        map.render(g,0,0);
        CharHandler.render(g);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame stateBasedGame, int i) throws SlickException {
        CharHandler.update(gc);
    }
}
