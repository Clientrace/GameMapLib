package Main;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;

import java.io.FileReader;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class MapParser {

    public static Image[][] solids;
    public static Image[][] hallows;

    public static void load(String path){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(path));
            JSONObject jobj = (JSONObject) obj;

            JSONArray layers = (JSONArray) jobj.get("layers");
            int amount = layers.size();
            for (int i = 0; i < amount; i++) {
                JSONObject layer = (JSONObject) layers.get(i);
                String type = (String) layer.get("name");
                switch (type) {
                    case "block": {
                        solids = parse((JSONArray) layer.get("data"), (int) layer.get("width"), (int) layer.get("height"));
                    }
                    break;
                    case "hallow": {
                        hallows = parse((JSONArray) layer.get("data"), (int) layer.get("width"), (int) layer.get("height"));
                    }
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Failed to load map file");
        }
    }

    private static Image[][] parse(JSONArray arr, int width, int height){
        Image[][] layer = new Image[width][height];
        int index;

        for (int y = 0; y < width; y++) {
            for (int x = 0; x < height; x++) {
                index = (int)((long)arr.get((y * width) + x));
                layer[x][y] = getSpriteImage(index);
            }
        }

        return layer;
    }

    private static Image getSpriteImage(int index){
        if(index==0) return null;
        index-=1;

        SpriteSheet sheet = Resources.getSprite("tilesheet");
        int vertical = sheet.getVerticalCount();
        int horizontal = sheet.getHorizontalCount();

        int y = (index/vertical);
        int x = (index % horizontal);

        return sheet.getSubImage(x,y);
    }

}
