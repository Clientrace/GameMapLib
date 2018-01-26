package ggj_game.utils.pathfinder;

public interface AStarHeuristic {
	public float getCost(Map map, int x, int y, int tx, int ty);
}
