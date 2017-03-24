package Main;

import PathFinder.Map;
import org.newdawn.slick.Graphics;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class MapHandler {

    private int size;

    public MapHandler(String tileset, String map, int size){
        this.size = size;
        Resources.init(tileset,size);
        MapParser.load(map);
    }

    public void render(Graphics g, float xRender, float yRender){


        for(int i=0;i<MapParser.hollows.getWidth();i++){
            for(int j=0;j<MapParser.hollows.getHeight();j++){
                if(MapParser.hollows.getTile()[i][j]!=null)
                    g.drawImage(MapParser.hollows.getTile()[i][j],i*size,j*size);
            }
        }


        for(int i=0;i<MapParser.solids.getWidth();i++){
            for(int j=0;j<MapParser.solids.getHeight();j++){
                if(MapParser.solids.getTile()[i][j]!=null)
                    g.drawImage(MapParser.solids.getTile()[i][j],i*size,j*size);
            }
        }
    }

    public void update(){

    }

}
