package Main;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class MapParser {

    public void parse(String path) throws Exception{
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(path));
        JSONObject jobj = (JSONObject) obj;

        JSONArray layers = (JSONArray) jobj.get("layers");
        int amount = layers.size();
        for(int i=0;i<amount;i++){
            JSONObject layer = (JSONObject) layers.get(i);
            String type = (String) layer.get("name");
            switch (type){
                case "block":{

                }break;
                case "hallow":{

                }break;
            }
        }

    }


}
