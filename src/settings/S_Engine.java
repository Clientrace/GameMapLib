package settings;

/* LOCAL CONSTANTS */
import constants.C_STATE_ID;
import constants.C_ENGINE_SETTINGS;

public class S_Engine {
	/* LOGIC UPDATE INTERVAL */
	public static int logicInterval 		= C_ENGINE_SETTINGS.LOGIC_INTERVAL_60; 
	
	/* RENDERING OPTIONS */
	public static final boolean isRender 	= C_ENGINE_SETTINGS.ALWAYS_RENDER;
	
	/* FRAMERATE SETTINGS */
	public static int frameRate 			= C_ENGINE_SETTINGS.FRAMERATE_60;
	
	/* FPS DISPLAY SETTINGS */
	public static boolean fpsDisplay 		= C_ENGINE_SETTINGS.FPS_SHOW;
	
	/* VSYNC SETTINGS */
	public static boolean vsync 			= C_ENGINE_SETTINGS.VSYNC_ON;
	
	/* INITIAL STATE */
	public static int initialState 			= C_STATE_ID.MENU;
	
	/* NATIVES PATH */
	public static String natives 			= C_ENGINE_SETTINGS.NATIVES_WINDOWS;
	
	/* LIBRARY PATH */
	public static String library 			= C_ENGINE_SETTINGS.LIB_PATH_LWJGL;
}
