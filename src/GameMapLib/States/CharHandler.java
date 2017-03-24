package GameMapLib.States;

import GameMapLib.Main.MapData;
import GameMapLib.PathFinder.AStar;
import GameMapLib.PathFinder.GMap;
import GameMapLib.PathFinder.Path;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by Clientrace on 25/03/2017.
 */
public class CharHandler {

    private static int charx1 = 17;
    private static int chary1 = 0;
    private static GMap gMap;
    private static AStar pathFinder;
    private static Path path;

    public static void init(){
        gMap = new GMap(MapData.WIDTH,MapData.HEIGHT);
        pathFinder = new AStar(gMap,100,false);
    }

    public static void render(Graphics g){
        g.fillRect(charx1*32,chary1*32,30,30);
    }

    public static void update(GameContainer gc){
        pathFinder = new AStar(gMap,100,false);
        path = new Path();
        System.out.println("FINDING PATH...");
        path = pathFinder.findPath(charx1,chary1,0,19);
        gMap.clearVisited();
        if(path!=null){
            System.out.println("PATH FOUND");
            if(path.contains(charx1-1,chary1)) {
                charx1--;
                System.out.println("1 FOUND");
            }
            else if(path.contains(charx1+1,chary1)) {
                charx1++;
                System.out.println("2 FOUND");
            }
            else if(path.contains(charx1,chary1-1)) {
                chary1--;
                System.out.println("3 FOUND");
            }
            else if(path.contains(charx1,chary1+1)) {
                chary1++;
                System.out.println("4 FOUND");
            }
        }
    }

}
