package ggj_game.engine;

/* LOCAL CONSTANTS */
import ggj_game.states.C_State_ID;

public class S_Engine {
	/* LOGIC UPDATE INTERVAL */
	public static int logicInterval 		= C_Engine_Settings.LOGIC_INTERVAL_60; 
	
	/* RENDERING OPTIONS */
	public static final boolean isRender 	= C_Engine_Settings.ALWAYS_RENDER;
	
	/* FRAMERATE SETTINGS */
	public static int frameRate 			= C_Engine_Settings.FRAMERATE_60;
	
	/* FPS DISPLAY SETTINGS */
	public static boolean fpsDisplay 		= C_Engine_Settings.FPS_SHOW;
	
	/* VSYNC SETTINGS */
	public static boolean vsync 			= C_Engine_Settings.VSYNC_ON;
	
	/* INITIAL STATE */
	public static int initialState 			= C_State_ID.MENU;
	
	/* NATIVES PATH */
	public static String natives 			= C_Engine_Settings.NATIVES_WINDOWS;
	
	/* LIBRARY PATH */
	public static String library 			= C_Engine_Settings.LIB_PATH_LWJGL;
}
