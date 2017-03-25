package GameMapLib.Main;

import java.util.ArrayList;

/**
 * Created by Clientrace on 24/03/2017.
 */

public class MapData {

    public static final int HOLLOW = 0;
    public static final int BLOCK = 1;
    public static int WIDTH;
    public static int HEIGHT;
    public static int map[][];

    public static ArrayList<Spawnpoint> spawnpoints;

    public static void init(){

        map = new int[MapParser.WIDTH][MapParser.HEIGHT];
        spawnpoints = new ArrayList<>();
        WIDTH = MapParser.WIDTH;
        HEIGHT = MapParser.HEIGHT;

        for(int i=0;i< MapParser.solids.getWidth();i++){
            for(int j=0;j< MapParser.solids.getHeight();j++){
                if(MapParser.solids.getBinaryMap()[i][j]==1){
                    map[i][j] = BLOCK;
                }
                else
                    map[i][j] = HOLLOW;
            }
        }


        for(int i=0;i< MapParser.spawnpoints.getWidth();i++){
            for(int j=0;j< MapParser.spawnpoints.getHeight();j++){
                if(MapParser.spawnpoints.getBinaryMap()[i][j]==1)
                    spawnpoints.add(new Spawnpoint(i,j));
            }
        }

    }

    public static boolean isBlock(int x, int y){
        if(MapParser.solids.getBinaryMap()[x][y]==1)
            return true;
        return false;
    }
}
