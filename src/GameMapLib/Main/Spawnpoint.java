package GameMapLib.Main;

/**
 * Created by Clientrace on 25/03/2017.
 */
public class Spawnpoint {
    private int x;
    private int y;
    public Spawnpoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
