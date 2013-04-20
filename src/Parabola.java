

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
  public Point[] intersectParabola (Parabola i)
  {       
      Point focus1 = this.getFocus ();
      Point focus2 = i.getFocus ();
      Hline directrix1 = this.getDirectrix ();
      Hline directrix2 = i.getDirectrix ();     

      return [];
  }
}