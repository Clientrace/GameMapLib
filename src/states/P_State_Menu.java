package states;

/* LWJGL LIBRARY */
import org.lwjgl.input.Keyboard;

/* SLICK LIBRARY */
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/* LOCAL CONSTANTS */
import constants.C_STATE_ID;

/* CONTROLS */
import input.P_Keyboard_Input;

public class P_State_Menu extends BasicGameState {
	/* ASSIGN STATE ID */
    public int getID() {
        return C_STATE_ID.MENU;
    }

    /* INITIALIZE STATE VARIABLES */
    public void init(GameContainer gc, StateBasedGame stateBasedGame) throws SlickException {
    	
    }
    
    /* RENDER GRAPHICS */
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
    	graphics.drawString("<~ Menu", 34, 30);
        graphics.drawString("Keyboard Controls: (Test your Keyboard)", 50, 80);
    
    }
    
    /* UPDATE STATE VARIABLES */
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
    	P_Keyboard_Input.updateInput();
    }
}
