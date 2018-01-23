package ggj_game.states.menu;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Menu_R {
	/* 64 x 128 */
	public static SpriteSheet Test;
	public static int Test_State;
	public static int Test_Frame;
	
	
	public static void initialize(){
		try {
			Test = new SpriteSheet( new Image("res/SS_TEST.png"), 64, 128 );
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
