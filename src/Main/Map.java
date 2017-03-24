package Main;

import org.newdawn.slick.Graphics;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class Map {

    public Map(String tileset, String map, int width, int height){
        Resources.init(tileset,width,height);
        MapParser.load("resources/map.json");
    }

    public void render(Graphics g){

    }

    public void update(){

    }

}
