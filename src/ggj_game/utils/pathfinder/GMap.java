package ggj_game.utils.pathfinder;

import GameMapLib.Main.MapData;


public class GMap implements Map{

	private int WIDTH;
	private int HEIGHT;

	public static boolean block;
	public boolean[][] visited;

	public GMap(int WIDTH, int HEIGHT){
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		visited = new boolean[WIDTH][HEIGHT];
		block = false;
	}
	
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
		if(MapData.map[x][y]==1)
			return true;
		return false;
	}

	public float getCost(int sx, int sy, int tx, int ty) {
		return 1;
	}
	
}
