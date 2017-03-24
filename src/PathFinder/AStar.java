package PathFinder;



import java.util.ArrayList;

import Main.MapData;

public class AStar implements PathFinder{
	private ArrayList closedList = new ArrayList();
	private SortedList openList = new SortedList();
	private Map map;
	private int maxDistance;
	private Node[][] nodes;
	private AStarHeuristic heuristic;
	
	public AStar(Map map, int maxD){
		this(map,maxD,new ClosestTile());
	}
	
	public AStar(Map map, int maxD, AStarHeuristic heuristic){
		this.heuristic = heuristic;
		this.map = map;
		this.maxDistance = maxD;
		
		nodes = new Node[map.getWidth()][map.getHeight()];
		for(int i=0;i<map.getWidth();i++){
			for(int j=0;j<map.getHeight();j++)
				nodes[i][j] = new Node(i,j);
		}
	}
	
	public Path findPath(int sx, int sy, int tx, int ty){
		if(map.blocked(tx, ty)){
			GameMap.block = true;
			return  null;
		}
		else
			GameMap.block = false;
		nodes[sx][sy].cost = 0;
		nodes[sx][sy].depth = 0;
		closedList.clear();
		openList.clear();
		openList.add(nodes[sx][sy]);

		nodes[tx][ty].parent = null;

		int max=0;
		while((max<maxDistance)&&(openList.size()!=0)){
			Node cur = (Node) openList.first();
			if(cur==nodes[tx][ty])
				break;
			openList.remove(cur);
			closedList.add(cur);
			for(int x=-1;x<2;x++){
				for(int y=-1;y<2;y++){
					if(x==0&&y==0)
						continue;
					if(x!=0&&y!=0)
						continue;
					if(x!=0 && y!=0)
						continue;
					int xp = x+cur.x;
					int yp = y+cur.y;
					if(checkPos(sx,sy,xp,yp)){
						float nxtStepCost = cur.cost+map.getCost(cur.x,cur.y,xp,yp);
						Node nxtTile = nodes[xp][yp];
						map.visited(xp, yp);
						if(nxtStepCost<nxtTile.cost){
							if(openList.contains(nxtTile))
								openList.remove(nxtTile);
							if(closedList.contains(nxtTile))
								closedList.remove(nxtTile);
						}
						if((!openList.contains(nxtTile))&&!closedList.contains(nxtTile)){
							nxtTile.cost = nxtStepCost;
							nxtTile.hueristic = heuristic.getCost(map,xp,yp,tx,ty);
							maxDistance = Math.max(maxDistance,nxtTile.setParent(cur));
							openList.add(nxtTile);
						}
					}
				}
			}
		}


		if(nodes[tx][ty].parent==null){
			return null;
		}
		Path path = new Path();
		Node target = nodes[tx][ty];
		while(target!=nodes[sx][sy]){
			path.prependStep(target.x, target.y);
			target = target.parent;
		}
		path.prependStep(sx, sy);
		return path;
	}
	
	private boolean checkPos(int sx, int sy, int x, int y){
		if(x<0||y<0||x>=map.getWidth()||y>=map.getHeight()){
			return false;
		}
		if(MapData.map[y][x]==1){
			return false;
		}
		return true;
	}
	
	private class SortedList{
		private ArrayList list = new ArrayList();
		public Object first(){
			return list.get(0);
		}
		public void clear(){
			list.clear();
		}
		public void add(Object o){
			list.add(o);
		}
		public void remove(Object o){
			list.remove(o);
		}
		public int size(){
			return list.size();
		}
		public boolean contains(Object o){
			return list.contains(0);
		}
	}
	private class Node{
		private int x;
		private int y;
		private float cost;
		private Node parent;
		private float hueristic;
		private int depth;
		
		public Node(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public int setParent(Node parent){
			depth = parent.depth+1;
			this.parent=parent;
			return depth;
		}
		
		public int compareTo(Object other){
			Node o = (Node) other;
			float f = hueristic + cost;
			float of = o.hueristic + o.cost;
			if(f<of)
				return -1;
			else if(f>of)
				return 1;
			else
				return 0;
		}
	}
}
