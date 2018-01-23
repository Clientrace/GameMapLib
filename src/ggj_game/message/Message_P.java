package ggj_game.message;

import ggj_game.states.StateID_C;
import ggj_game.states.menu.Menu_L;

public class Message_P {
	public static void send(int StateID, Object Data){
		switch(StateID){
		case StateID_C.MENU:
			Menu_L.getMessage(Data);
			break;
		default:
			
			break;
		}
	}
}
