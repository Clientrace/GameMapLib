package GameMapLib.PathFinder;

public class ClosestTile implements AStarHeuristic{
	public float getCost(Map map, int x, int y, int tx, int ty){
		float dx = tx - x;
		float dy = ty - y;
		float res = (float) (Math.sqrt(dx*dx)+(dy*dy));
		return res;
	}
}
