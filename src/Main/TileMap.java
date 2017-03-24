package Main;

import org.newdawn.slick.Image;

/**
 * Created by Clientrace on 24/03/2017.
 */
public class TileMap {
    private Image[][] tile;
    private int width;
    private int height;

    public TileMap(Image[][] tile, int width, int height){
        this.tile = tile;
        this.width = width;
        this.height = height;
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
}
