import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Actor {
  Color color;
  List<Polygon> polygons = new ArrayList<>();
  Cell loc;
  List<Polygon> display;

  public void paint(Graphics g) {
    for(Polygon p: display) {
      g.setColor(color);
      g.fillPolygon(p);
      g.setColor(Color.GRAY);
      g.drawPolygon(p);
    }
  }
}


/*We will use `ArrayList` again!  Have the `Color` field of `Actor` changed to 
a list of polygons and initialise each subclass to an appropriate set of polygons.  
You might find the following polygons a useful starting point where `location` 
is the top-left point of the actor (but I am sure you can do better as well - 
share your designs on the forums!): */