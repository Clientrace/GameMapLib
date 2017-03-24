package Main;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class Resources {

    private static Map<String, Image> images;

    public static void init(String filepath){
        images = new HashMap<>();
        try{
            images.put("tileset",loadImages(filepath));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Image loadImages(String path) throws SlickException{
        return new Image(path,false,Image.FILTER_NEAREST);
    }

    public static Image getImage(String id){return images.get(id);}

}
