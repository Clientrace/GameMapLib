package constants;

public class C_ENGINE_SETTINGS {
	/* LOGIC UPDATE INTERVAL */
	public static final int LOGIC_INTERVAL_60 			= 60;
	
	/* FRAMERATE SETTINGS */
	public static final int FRAMERATE_60	 			= 60;
	
	/* RENDERING OPTIONS */
	public static final boolean ALWAYS_RENDER 			= true;
	
	/* FPS DISPLAY SETTINGS */
	public static final boolean FPS_SHOW 				= true;
	public static final boolean FPS_HIDE				= false;
	
	/* VSYNC SETTINGS */
	public static final boolean VSYNC_ON				= true;
	public static final boolean VSYNC_OFF				= true;
	
	/* NATIVES PATH */
	public static final String NATIVES_WINDOWS			= "lib/natives-windows";
	public static final String NATIVES_LINUX			= "lib/natives-linux";
	
	/* LIBRARY PATH */
	public static final String LIB_PATH_LWJGL			= "org.lwjgl.librarypath";
}
