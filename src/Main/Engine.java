package Main;

import States.Test;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import java.io.File;


/**
 * Created by Clientrace on 24/03/2017.
 */
public class Engine extends StateBasedGame{

    public Engine() {
        super("GAMEMAPLIB TEST");
    }



    public static void main(String args[]){
        File f = new File("lib/natives-windows");
        if(f.exists()){
            System.out.println("Initialization");
            System.setProperty("org.lwjgl.librarypath",f.getAbsolutePath());
        }
        else
            System.out.println("Can't find natives");

        try{
            AppGameContainer system = new AppGameContainer(new Engine());
            system.setDisplayMode(Window.WIDTH, Window.HEIGHT,false);
            system.start();
        }catch (SlickException e){
            e.printStackTrace();
        }
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        gc.setMaximumLogicUpdateInterval(60);
        gc.setTargetFrameRate(60);
        gc.setAlwaysRender(true);
        gc.setShowFPS(false);
        gc.setVSync(true);
        this.addState(new Test());
    }
}
