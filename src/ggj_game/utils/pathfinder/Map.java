package ggj_game.utils.pathfinder;

public interface Map {
	public int getWidth();
	public int getHeight();
	public void visited(int x, int y);
	public boolean blocked(int x, int y);
	public float getCost(int sx, int sy, int tx, int ty);
}
