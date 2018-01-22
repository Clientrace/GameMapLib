package ggj_game.engine;

/* KEYBOARD CONTROL */
import ggj_game.window.S_Window;

/* SLICK LIBRARY */
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class P_Engine extends StateBasedGame{
	/* WINDOWS NAME SETTINGS */
    public P_Engine() {
        super(S_Window.WindowName);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
    	
    	/* ENGINE SETTINGS */
        gc.setMaximumLogicUpdateInterval( S_Engine.logicInterval );
        gc.setTargetFrameRate( S_Engine.frameRate );
        gc.setAlwaysRender(S_Engine.isRender);
        gc.setShowFPS( S_Engine.fpsDisplay );
        gc.setVSync( S_Engine.vsync );
        
        /* INITIALIZE STATES */
        for( int stateCounter = 0; stateCounter < ggj_game.states.S_State.StateList.length; stateCounter++ ){
        	this.addState( ggj_game.states.S_State.StateList[stateCounter] );
        }

        /* ENTER INITIAL STATE */
        this.enterState( ggj_game.states.S_State.initialState );

    }
}
