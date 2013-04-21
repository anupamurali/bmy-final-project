import java.util.*;
public class Mainclass {

	/**
	 * @param args
	 */
	
	ArrayList<Site> sites;
    TreeMap beachline = new TreeMap<double,ParabolaSegment> ();
    	
	
    ArrayList<Hline> siteEvents;
   public void siteEvent(Point p)
  {
      double x = p.getx();
      double previous = beachline.floorKey(x);
      double next = beachline.ceilingKey(x);
      Parabola par = new Parabola(x, Hline(x.gety()));
      ArrayList<Point> = intersect1 next.intersectParabola(previous); 
  }
    //SITE EVENTS ARE IMPLEMENTED AS POINTS NOW... NOT HLINE

		//Keeps the list of site events ordered as a priority queue.
    //circleEvents = ArrayList<Hline>;
	//Keeps the list of circle events ordered as a priority queue.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  // sites = new ArrayList<Site>();
	   //siteEvents = new ArrayList<Site>();
	}			
	
    public void genSiteEvents(){ 
        for(int i=0; i < sites.size(); i++){
        	siteEvents.add(new Hline(sites.get(i).getPoint().gety()));
        }
        Collections.sort(siteEvents, new CustomComparator2());
    }
    
   // public ArrayList<double> genCircleEvents(){   	
    //}
    
    //Finds the circumcenter of three points, taken from
    //http://stackoverflow.com/questions/4103405/what-is-the-algorithm-for-finding-the-center-of-a-circle-from-three-points
    public Point circumcenter(Point a, Point b, Point c){
       double aSlope = a.Slope(b);
       double bSlope = b.Slope(c);
       
       double center_x = aSlope*bSlope*(a.gety() - c.gety()) 
    		      + bSlope*(a.getx()+b.getx()) 
    		      - aSlope*(b.getx() +c.getx())/(2*(bSlope-aSlope));
       
       double center_y = -1*(center_x - (a.getx()+b.getx()/2))/aSlope + (a.gety()+b.gety())/2;
       return new Point(center_x, center_y);
    }
    
    public Point bottomCircle(Point a, Point b, Point c){
    	Point center = circumcenter(a, b, c);
    	double radius = a.distance(center);
    	return new Point(center.getx(), center.gety() - radius);
    }
}

class CustomComparator2 implements Comparator<Hline>
{
	public int compare(Hline h1, Hline h2){
		return Double.compare(h1.gety(), h2.gety());
	}
}
