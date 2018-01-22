package ggj_game.engine;

import ggj_game.input.P_Keyboard_Input;
import ggj_game.window.S_Window;

import java.io.File;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {
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
}
