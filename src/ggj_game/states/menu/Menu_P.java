package ggj_game.states.menu;

/* LWJGL LIBRARY */
import org.lwjgl.input.Keyboard;

/* SLICK LIBRARY */
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/* LOCAL CONSTANTS */
import ggj_game.input.Keyboard_P;
import ggj_game.states.StateID_C;

public class Menu_P extends BasicGameState implements bKeyListener, MouseListener{
	private int frameCount = 0;
	private int animX = 0;
	private int animY = 0;
	private int maxY = 0;	
	private int posX = 100;
	private int posY = 100;
	
	/* ASSIGN STATE ID */
    public int getID() {
        return StateID_C.MENU;
    }

    /* INITIALIZE STATE VARIABLES */
    public void init(GameContainer gc, StateBasedGame stateBasedGame) throws SlickException {
    	Menu_R.initialize();
    }
    
    /* RENDER GRAPHICS */
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
    	graphics.drawString("<~ Menu", 34, 30);
        graphics.drawString("Keyboard Controls: (Test your Keyboard)", 50, 80);
        
        Object[] KeyList = Keyboard_P.getKeyList();
        
        for(int a=0; a<KeyList.length; a++){
        	graphics.drawString(Keyboard.getKeyName((Integer)KeyList[a]), 100, a*25 + 100);
        }
        
        if( Keyboard_P.isPressed(Keyboard.KEY_SPACE, Keyboard.KEY_A, Keyboard.KEY_B) ){	
        	graphics.drawString("SPACE + A + B", 200, 200);
        }
        
        graphics.drawString(String.valueOf(Menu_V.EventVar), 2, 2);
        
        graphics.drawImage(Menu_R.Test.getSprite(animX, animY), posX, posY);
        
    }
    
    /* UPDATE STATE VARIABLES */
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
//    	P_Keyboard_Input.printControls();
    	updateEvent();
    	
    	frameCount += i;
    	
    	if(frameCount % 1000 > 40){
    		animX++;
    		
    		if(animX >= maxY){
    			animX=0;
    		}
    		if(animY == 1){
    			posX-=4;
    		}
    		else if(animY == 3){
    			posX+=4;
    		}
    		
    		if(Keyboard_P.isPressed(Keyboard.KEY_S)){
    			
    			if(animY == 0){
    				animY=1;
    			}
    			else if(animY == 2){
    				animY=3;
    			}
    			posY+=4;
    		}
    		else if(Keyboard_P.isPressed(Keyboard.KEY_W)){
    			
    			if(animY == 0){
    				animY=1;
    			}
    			else if(animY == 2){
    				animY=3;
    			}
    			posY-=4;
    		}
    		
    		frameCount = 0;
    	}
    	
    	System.out.println(animX);
    	
//    	if(i % 100 == 0){
//    		if(animX >= Menu_R.Test.getHorizontalCount()){
//    			animX = 0;
//    		}
//    		else{
//    			animX++;
//    		}
//    	}
    }
    
    /* CONTROL EVENT PROCESSING */
    public void updateEvent(){
    	/* CONTROLS */
    	/* TEST CONTROL */
    	if(Keyboard_P.isPressed(Keyboard.KEY_1)){
    		Menu_L.event1();
    	}
    	if(Keyboard_P.isPressed(Keyboard.KEY_2)){
    		Menu_L.event2();
    	}
    	if(Keyboard_P.isPressed(Keyboard.KEY_3)){
    		Menu_L.event3();
    	}
    	if(Keyboard_P.isPressed(Keyboard.KEY_4)){
    		Menu_L.event4();
    	}
    	if(Keyboard_P.isPressed(Keyboard.KEY_5)){
    		Menu_L.event5();
    	}
    	if(Keyboard_P.isPressed(Keyboard.KEY_5, Keyboard.KEY_6)){
    		Menu_L.event6();
    	}
    	
    	
    	if(Keyboard_P.isPressed(Keyboard.KEY_A)){
    		animY=1;
    		maxY=6;
    	}
    	else if(Keyboard_P.isPressed(Keyboard.KEY_D)){
    		animY=3;
    		maxY=6;
    	}
    	else{
    		if(animY==1){
    			animY=0;
    		}
    		else if(animY==3){
    			animY=2;
    		}
    		maxY=10;
    	}
    }
    
    /* INPUT LISTENERS */
    /* KEYBOARD LISTENER */
    @Override
    public void keyPressed(int key, char c) {
    	Keyboard_P.addKeypress(key);
    }
    
    @Override
    public void keyReleased(int key, char c) {
    	Keyboard_P.removeKeypress(key);
    }
    
    /* MOUSE LISTENER */
    @Override
    public void mouseClicked(int button, int x, int y, int clickCount){
    	System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
    
    @Override
    public void mouseDragged(int oldx, int oldy, int newx, int newy){
    	System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
    
    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy){
    	System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
    
    @Override
    public void mousePressed(int button, int x, int y){
    	System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
    
    @Override
    public void mouseReleased(int button, int x, int y){
    	System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
    
    @Override
    public void mouseWheelMoved(int change){
    	System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
}
