package input;

/* LWJGL LIBRARY */
import org.lwjgl.input.Keyboard;







/* JAVA LIBRARY */
import java.util.ArrayList;

public class P_Keyboard_Input {
	private static ArrayList<Integer> KeyInput;
	private static Object[] KeypressArray;
	
	public static void initialize(){
		KeyInput = new ArrayList<Integer>();
	}
	
	public static void updateInput(){
		
		/* ADD KEYPRESS */
		if(Keyboard.isKeyDown(Keyboard.getEventKey()) && !KeyInput.contains(Keyboard.getEventKey())){
			KeyInput.add((Integer)Keyboard.getEventKey());
		}
		
		/* REMOVE KEYPRESS */
		KeypressArray = KeyInput.toArray();
		
		for(int a=0; a < KeypressArray.length; a++ ){
			if(!Keyboard.isKeyDown((Integer)KeypressArray[a])){
				KeyInput.remove(KeypressArray[a]);
			}
		}
	}
	
	public static void printControls(){
		System.out.print("{ ");
		for(Integer keyPressed : KeyInput){
			System.out.print(keyPressed + " ");
		}
		System.out.println(" }");
		
	}
	
	public static boolean isPressed(int KeyIndex){
		return KeyInput.contains((Integer)KeyIndex);
	}
}
