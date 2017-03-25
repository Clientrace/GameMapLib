package GameMapLib.Main;


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


    public static TileMap solids;
    public static TileMap hollows;
    public static TileMap spawnpoints;
    public static int WIDTH;
    public static int HEIGHT;

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
                WIDTH = (int)((long) layer.get("width"));
                HEIGHT = (int)(long) layer.get("height");

                switch (type) {
                    case "solids": {
                        System.out.println(" "+layer.get("data"));
                        Image[][] imgval = parse((JSONArray) layer.get("data"),WIDTH,HEIGHT);
                        solids = new TileMap(imgval,WIDTH,HEIGHT);
                    }
                    break;
                    case "hollow": {
                        System.out.println(" "+layer.get("data"));
                        Image[][] imgval = parse((JSONArray) layer.get("data"),WIDTH,HEIGHT);
                        hollows = new TileMap(imgval,WIDTH,HEIGHT);
                    }
                    break;
                    case "spawnpoints": {
                        System.out.println(" "+layer.get("data"));
                        Image[][] imgval = parse((JSONArray) layer.get("data"),WIDTH,HEIGHT);
                        spawnpoints = new TileMap(imgval,WIDTH,HEIGHT);
                    }
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Failed to load map file");
            e.printStackTrace();
        }
    }

    private static Image[][] parse(JSONArray arr, int width, int height){
        Image[][] layer = new Image[width][height];
        int index;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                index = (int)((long)arr.get((j * width) + i));
                layer[i][j] = getSpriteImage(index);
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


        int x = (index % horizontal);
        int y = (index / vertical);

        System.out.println(horizontal);
        System.out.println("INDEX: "+index+" X: "+x+" Y: "+y);

        System.out.println("X: "+x+"Y: "+y);
        return sheet.getSubImage(x,y);
    }

}
