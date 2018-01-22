package settings;

/* SLICK LIBRARY */
import org.newdawn.slick.state.BasicGameState;

/* LOCAL CONSTANTS */
import constants.C_STATE_ID;

/* STATE CLASS PROCESS */
import states.P_State_Menu;


public class S_State {
	/* INITIAL STATE */
	public static int initialState 				= 	C_STATE_ID.MENU;
	
	/* STATE OBJECTS */
	public static BasicGameState StateList[] 	= {
		new P_State_Menu(),		/* StateID: 0 */
	};
}
