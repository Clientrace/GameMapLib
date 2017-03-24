package Map;

import Main.MapParser;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class MapData {

    public static final int HOLLOW = 0;
    public static final int BLOCK = 1;
    public static int map[][];

    public static void init(){

        map = new int[MapParser.WIDTH][MapParser.HEIGHT];

        for(int i=0;i< MapParser.solids.getWidth();i++){
            for(int j=0;j< MapParser.solids.getHeight();j++){
                if(MapParser.solids.getTile()!=null)
                    map[i][j] = BLOCK;
                else
                    map[i][j] = HOLLOW;
            }
        }
    }
}
