package PathFinder;

import Main.MapData;


public class GameMap implements Map{

	public static final int WIDTH = 12;
	public static final int HEIGHT = 20;
	public static boolean block = false;
	public boolean[][] visited = new boolean[WIDTH][HEIGHT];
	
	public void clearVisited(){
		for(int i=0;i<getWidth();i++){
			for(int j=0;j<getHeight();j++){
				visited[i][j] = false;
			}
		}
	}
	public int getWidth() {
		return WIDTH;
	}

	public int getHeight() {
		return HEIGHT;
	}

	public void visited(int x, int y) {
		visited[x][y] = true;
	}

	public boolean blocked(int x, int y) {
		if(MapData.map[y][x]==1)
			return true;
		return false;
	}

	public float getCost(int sx, int sy, int tx, int ty) {
		return 1;
	}
	
}
