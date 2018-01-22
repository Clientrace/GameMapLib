package ggj_game.states.menu;

/* LWJGL LIBRARY */
import org.lwjgl.input.Keyboard;

/* SLICK LIBRARY */
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/* LOCAL CONSTANTS */
import ggj_game.input.P_Keyboard_Input;
import ggj_game.states.C_State_ID;

public class P_State_Menu extends BasicGameState implements KeyListener{
	/* ASSIGN STATE ID */
    public int getID() {
        return C_State_ID.MENU;
    }

    /* INITIALIZE STATE VARIABLES */
    public void init(GameContainer gc, StateBasedGame stateBasedGame) throws SlickException {
    	
    }
    
    /* RENDER GRAPHICS */
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
    	graphics.drawString("<~ Menu", 34, 30);
        graphics.drawString("Keyboard Controls: (Test your Keyboard)", 50, 80);
        
        Object[] KeyList = P_Keyboard_Input.getKeyList();
        
        for(int a=0; a<KeyList.length; a++){
        	graphics.drawString(Keyboard.getKeyName((Integer)KeyList[a]), 100, a*25 + 100);
        }
        
        if( P_Keyboard_Input.isPressed(Keyboard.KEY_SPACE, Keyboard.KEY_A, Keyboard.KEY_B) ){
        	graphics.drawString("SPACE + A + B", 200, 200);
        }
        
        graphics.drawString(String.valueOf(V_State_Menu.EventVar), 2, 2);
        
    }
    
    /* UPDATE STATE VARIABLES */
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
    	P_Keyboard_Input.printControls();
    	updateEvent();
    }
    
    /* CONTROL EVENT PROCESSING */
    public void updateEvent(){
    	/* CONTROLS */
    	/* TEST CONTROL */
    	if(P_Keyboard_Input.isPressed(Keyboard.KEY_1)){
    		L_State_Menu.event1();
    	}
    	if(P_Keyboard_Input.isPressed(Keyboard.KEY_2)){
    		L_State_Menu.event2();
    	}
    	if(P_Keyboard_Input.isPressed(Keyboard.KEY_3)){
    		L_State_Menu.event3();
    	}
    	if(P_Keyboard_Input.isPressed(Keyboard.KEY_4)){
    		L_State_Menu.event4();
    	}
    	if(P_Keyboard_Input.isPressed(Keyboard.KEY_5)){
    		L_State_Menu.event5();
    	}
    	if(P_Keyboard_Input.isPressed(Keyboard.KEY_5, Keyboard.KEY_6)){
    		L_State_Menu.event6();
    	}
    }
    
    /* INPUT LISTENERS */
    @Override
    public void keyPressed(int key, char c) {
    	P_Keyboard_Input.addKeypress(key);
    }
    
    @Override
    public void keyReleased(int key, char c) {
    	P_Keyboard_Input.removeKeypress(key);
    }
}
