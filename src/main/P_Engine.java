package main;

/* KEYBOARD CONTROL */
import input.P_Keyboard_Input;

/* JAVA LIBRARIES */
import java.io.File;

/* SLICK LIBRARY */
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/* LOCAL SETTINGS*/
import settings.S_State;
import settings.S_Engine;
import settings.S_Window;

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
        for( int stateCounter = 0; stateCounter < S_State.StateList.length; stateCounter++ ){
        	this.addState( S_State.StateList[stateCounter] );
        }

        /* ENTER INITIAL STATE */
        this.enterState( S_State.initialState );

    }
}
