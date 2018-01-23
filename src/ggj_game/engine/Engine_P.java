package ggj_game.engine;

/* KEYBOARD CONTROL */
import ggj_game.window.Window_S;

/* SLICK LIBRARY */
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Engine_P extends StateBasedGame{
	/* WINDOWS NAME SETTINGS */
    public Engine_P() {
        super(Window_S.WindowName);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
    	
    	/* ENGINE SETTINGS */
        gc.setMaximumLogicUpdateInterval( Engine_S.logicInterval );
        gc.setTargetFrameRate( Engine_S.frameRate );
        gc.setAlwaysRender(Engine_S.isRender);
        gc.setShowFPS( Engine_S.fpsDisplay );
        gc.setVSync( Engine_S.vsync );
        
        /* INITIALIZE STATES */
        for( int stateCounter = 0; stateCounter < ggj_game.states.State_S.StateList.length; stateCounter++ ){
        	this.addState( ggj_game.states.State_S.StateList[stateCounter] );
        }

        /* ENTER INITIAL STATE */
        this.enterState( ggj_game.states.State_S.initialState );

    }
}
