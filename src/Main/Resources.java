package Main;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class Resources {

    private static Map<String, Image> images;
    private static Map<String, SpriteSheet> sprites;

    public static void init(String filepath, int width, int height){
        images = new HashMap<>();
        try{
            images.put("tileset",loadSprite(filepath,width,height));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Image loadImages(String path) throws SlickException{
        return new Image(path,false,Image.FILTER_NEAREST);
    }

    public static Image getImage(String id){return images.get(id);}

    public static SpriteSheet loadSprite(String path, int tw, int th)throws SlickException{
        return new SpriteSheet(loadImages(path),tw,th);
    }

    public static SpriteSheet getSprite(String getter){
        return sprites.get(getter);
    }

    public static Image getSpriteImage(String getter, int y, int x){
        return sprites.get(getter).getSubImage(x,y);
    }

    public static Image image(String getter){
        return sprites.get(getter);
    }

}
