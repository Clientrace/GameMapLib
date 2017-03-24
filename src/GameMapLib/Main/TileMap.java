package GameMapLib.Main;

import org.newdawn.slick.Image;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class TileMap {
    private Image[][] tile;
    private int width;
    private int height;
    private int binaryMap[][];

    public TileMap(Image[][] tile, int width, int height){
        this.tile = tile;
        this.width = width;
        this.height = height;
        this.binaryMap = new int[width][height];

        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                if(tile[i][j]==null)
                    binaryMap[i][j]=0;
                else
                    binaryMap[i][j]=1;
            }
        }
    }

    public Image[][] getTile() {
        return tile;
    }

    public void setTile(Image[][] tile) {
        this.tile = tile;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[][] getBinaryMap() {
        return binaryMap;
    }

    public void setBinaryMap(int[][] binaryMap) {
        this.binaryMap = binaryMap;
    }
}
