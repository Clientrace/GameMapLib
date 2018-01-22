package ggj_game.message;

import ggj_game.states.C_State_ID;
import ggj_game.states.menu.L_State_Menu;

public class P_Message {
	public static void send(int StateID, Object Data){
		switch(StateID){
		case C_State_ID.MENU:
			L_State_Menu.getMessage(Data);
			break;
		default:
			
			break;
		}
	}
}
