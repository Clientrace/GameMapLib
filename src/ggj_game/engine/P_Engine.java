package ggj_game.engine;

/* KEYBOARD CONTROL */
import ggj_game.input.P_Keyboard_Input;
import ggj_game.window.S_Window;

/* JAVA LIBRARIES */
import java.io.File;

/* SLICK LIBRARY */
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class P_Engine extends StateBasedGame{
	/* WINDOWS NAME SETTINGS */
    public P_Engine() {
        super(S_Window.WindowName);
    }

    /* CLASS MAIN */
    public static void main(String args[]){
    	/* SET NATIVES */
        File f = new File( S_Engine.natives );
        
        if(f.exists()){
        	/* SET LIBRARY */
            System.setProperty( S_Engine.library ,f.getAbsolutePath());
        }
        try{
        	/* INITIALIZE ENGINE */
            AppGameContainer system = new AppGameContainer(new P_Engine());
            
            /* WINDOW SETTINGS */
            system.setDisplayMode( 	S_Window.Width , 
				            		S_Window.Height , 
				            		S_Window.isWindowed );
            
            /* INITIALIZE KEYBOARD CONTROL */
            P_Keyboard_Input.initialize();
            
            /* START ENGINE */
            system.start();
            
        }catch (SlickException e){
            e.printStackTrace();
        }
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
