public class Parabola
{
  Point focus;
  Hline directrix;
  public Parabola (Point f, Hline d)
  {
         focus = f;
         directrix = d;
  }
 
    public point getFocus (Parabola i)
    {
	return i.focus;
    }
 
    public hline getDirectrix (Parabola i)
    {
        return i.directrix;
    }

//Anupa
  public point[] intersectParabola (Parabola i)
  {       
    
  }

    //equation of a  parabola  is (x-h)^2 = 4p(y-k)  where the focus is (h,k+p) and directrix is y=k-p.    (http://jwilson.coe.uga.edu/emt725/class/sarfaty/emt669/instructionalunit/parabolas/parabolas.html)

}
//Anupa, make get and set for ParabolaSegment. And other stuff in Parabola.
public class ParabolaSegment
{
float start;
float end;
Parabola p;
//usual constructors, get and set functions
}

