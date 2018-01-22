package ggj_game.states;

/* SLICK LIBRARY */
import ggj_game.states.menu.P_State_Menu;

import org.newdawn.slick.state.BasicGameState;

public class S_State {
	/* INITIAL STATE */
	public static int initialState 				= 	C_State_ID.MENU;
	
	/* STATE OBJECTS */
	public static BasicGameState StateList[] 	= {
		new P_State_Menu(),		/* StateID: 0 */
	};
}
