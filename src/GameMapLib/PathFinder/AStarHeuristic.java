package GameMapLib.PathFinder;

public interface AStarHeuristic {
	public float getCost(Map map, int x, int y, int tx, int ty);
}
