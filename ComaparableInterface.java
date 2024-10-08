package collectionSetDemo;

import java.util.TreeSet;

class point implements Comparable<Object>
{
	int x; 
	int y;
	
	public point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "X = "+x + " "+ "Y = "+y;
	}
	
	public int compareTo(Object o)
	{
		point p = (point)o;
		if(this.x < p.x)
			return -1;
		else if(this.x > p.x)
			return 1;
		else
		{
			if(this.y < p.y)
				return -1;
			else if (this.y > p.y)
				return 1;
			else
				return 0;
						
		}
	}
	
}

public class ComaparableInterface 
{

	public static void main(String[] args) 
	{
		TreeSet<point> ts = new TreeSet<>();
		ts.add(new point(1,1));
		ts.add(new point(4,5));
		ts.add(new point(4,2));
		ts.add(new point(5,5));
		ts.add(new point(5,8));
		
		System.out.println(ts);
		

	}

}
