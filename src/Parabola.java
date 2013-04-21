import java.util.*;

public class Parabola
{
  Point focus;
  Hline directrix;
  public Parabola (Point f, Hline d)
  {
         focus = f;
         directrix = d;
  }
 
    public Point getFocus () {return focus;}
 
    public Hline getDirectrix () {return directrix;}

    public void setFocus (Point newFocus) {focus = newFocus;}
  
    public void setDirectrix (Hline newDirectrix) {directrix = newDirectrix;}

//Anupa 
  public ArrayList <Point> intersectParabola (Parabola i)
  {       
      Point focus1 = this.getFocus ();
      Point focus2 = i.getFocus ();
      Hline directrix1 = this.getDirectrix ();
      Hline directrix2 = i.getDirectrix ();     

      double a = focus1.getx ();
      double b = focus1.gety ();
      double c = directrix1.gety ();
      double d = focus2.getx ();
      double e = focus2.gety ();
      double f = directrix2.gety ();

      double p = 1/(b-c) - 1/(e-f);
      double q = 2*d/(e-f) - 2*a/(b-c);
      double r = (a*a+b*b-c*c)/(b-c) - (d*d + e*e - f*f)/(e-f);

      double discriminant = q*q-4*p*r;

      ArrayList<Point> soltn = new ArrayList<Point>();       
    

      if (p == 0) 
	  {
	      if (q!=0)     
                  {soltn.add(new Point ((-r/q), (((-r/q)-a)*((-r/q)-a) + b*b - c*c)/(2*(b-c))));}
	      return soltn;

	  }
      if (discriminant > 0)
      {
       double x1 = (-q-Math.sqrt(discriminant))/(2*p);
       double x2 = (-q+Math.sqrt(discriminant))/(2*p);
       soltn.add(new Point (x1, ((x1-a)*(x1-a) + b*b - c*c)/(2*(b-c))));
       soltn.add(new Point (x2, ((x2-a)*(x2-a) + b*b - c*c)/(2*(b-c))));
       }
      else if (discriminant == 0)
      { 
	 double x = -q/(2*p);
         soltn.add(new Point (x,((x-a)*(x-a) + b*b - c*c)/(2*(b-c))));
      }
      else throw new ArithmeticException ();
      return soltn;
  }
}