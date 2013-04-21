public class Point {

	double x;
	double y;
	double slope;
	public Point(double xh, double yh)
	{
		x = xh;
		y = yh;
	}
	public void setx (double xh) {x = xh;}
	public void sety (double yh) {y = yh;}
	public double getx () {return x;}
	public double gety () {return y;}

	public double getSlope() {return slope;}

	public double Slope (Point p)
	{
		if(p.getx() == x) throw new ArithmeticException();
		else slope = (p.gety() - y)/(p.getx() - x);
		return slope;
	}

	public double distance (Point p){
		double x1 = Math.pow(p.getx() - x, 2);
		double x2 = Math.pow(p.gety() - y, 2);
		return Math.sqrt(x1+x2);
	}
	
}
