package ggj_game.engine;

/* LOCAL CONSTANTS */
import ggj_game.states.StateID_C;

public class Engine_S {
	/* LOGIC UPDATE INTERVAL */
	public static int logicInterval 		= Engine_C.LOGIC_INTERVAL_60; 
	
	/* RENDERING OPTIONS */
	public static final boolean isRender 	= Engine_C.ALWAYS_RENDER;
	
	/* FRAMERATE SETTINGS */
	public static int frameRate 			= Engine_C.FRAMERATE_60;
	
	/* FPS DISPLAY SETTINGS */
	public static boolean fpsDisplay 		= Engine_C.FPS_SHOW;
	
	/* VSYNC SETTINGS */
	public static boolean vsync 			= Engine_C.VSYNC_ON;
	
	/* INITIAL STATE */
	public static int initialState 			= StateID_C.MENU;
	
	/* NATIVES PATH */
	public static String natives 			= Engine_C.NATIVES_WINDOWS;
	
	/* LIBRARY PATH */
	public static String library 			= Engine_C.LIB_PATH_LWJGL;
}
