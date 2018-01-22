package input;

/* LWJGL LIBRARY */
import org.lwjgl.input.Keyboard;





/* JAVA LIBRARY */
import java.util.ArrayList;

public class P_Keyboard_Input {
	public static ArrayList<Object> KeyInput;
	
	public static int Keypress;
	public static boolean Keydown;
	
	public static void updateInput(){
		
	}
	
	public static void printControls(){
		System.out.print("{ ");
		for( int a=0; a<KeyInput.size(); a++ ){
			System.out.print( KeyInput.get(a) + " " );
		}
		System.out.println("} ");
	}
	
}
