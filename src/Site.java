import java.util.*;
public class Site {

	Point s;
	ArrayList<Point> vertexlist;
	
	public Site(Point p){
		s = p;
		vertexlist = new ArrayList<Point>();
	}
	
	public Point getPoint(){
		return s;
	}
	
	public void setPoint(Point p){
		s = p;
	}
	
	public void addVertex(Point p){
		vertexlist.add(p);
	}
	
	public ArrayList<Point> getVertexList(){
		return vertexlist;
	}
	
	//public void sortPoints()
	
}
