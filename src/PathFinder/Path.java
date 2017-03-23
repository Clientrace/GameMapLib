package PathFinder;

import java.util.ArrayList;

public class Path {
	private ArrayList steps = new ArrayList();
	public Path(){}
	public int getLength(){
		return steps.size();
	}
	public Step getStep(int i){
		return (Step) steps.get(i);
	}
	public int getX(int i){
		return getStep(i).x;
	}
	public int getY(int i){
		return getStep(i).y;
	}
	public void addStep(int x, int y){
		steps.add(new Step(x,y));
	}
	public void prependStep(int x, int y){
		steps.add(0,new Step(x,y));
	}
	public boolean contains(int x, int y){
		return steps.contains(new Step(x,y));
	}
	
	public class Step{
		private int x;
		private int y;
		public Step(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX(){
			return x;
		}
		public int getY(){
			return y;
		}
		public boolean equals(Object o){
			if(o instanceof Step){
				Step o2 = (Step) o;
				return (o2.x==x)&&(o2.y==y);
			}
			return false;
		}
	}
}
