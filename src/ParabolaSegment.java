//Anupa, make get and set for ParabolaSegment. And other stuff in Parabola.
public class ParabolaSegment
{
  double start;
  double end;
  Parabola p;
//usual constructors, get and set functions

  public ParabolaSegment (double s, double e, Parabola para)
  {
         start = s;
         end = e;
         p = para;
  }

    public double getStart () {return start;}
    
    public double getEnd () {return end;}
 
    public Parabola getParabola () {return p;}

    public void setStart (double new_start) {start = new_start;}

    public void setEnd (double new_end) {end = new_end;}

    public void setParabola (Parabola new_p) {p = new_p;}
}

