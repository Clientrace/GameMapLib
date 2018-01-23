package ggj_game.engine;

import ggj_game.input.Keyboard_P;
import ggj_game.window.Window_S;

import java.io.File;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {
	/* CLASS MAIN */
    public static void main(String args[]){
    	/* SET NATIVES */
        File f = new File( Engine_S.natives );
        
        if(f.exists()){
        	/* SET LIBRARY */
            System.setProperty( Engine_S.library ,f.getAbsolutePath());
        }
        try{
        	/* INITIALIZE ENGINE */
            AppGameContainer system = new AppGameContainer(new Engine_P());
            
            /* WINDOW SETTINGS */
            system.setDisplayMode( 	Window_S.Width , 
				            		Window_S.Height , 
				            		Window_S.isWindowed );
            
            /* INITIALIZE KEYBOARD CONTROL */
            Keyboard_P.initialize();
            
            /* START ENGINE */
            system.start();
            
        }catch (SlickException e){
            e.printStackTrace();
        }
    }
}
