import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.awt.Polygon;

public abstract class Actor {
  Color color;
  List<Polygon> polygons = new ArrayList<>();
  Cell loc;

  public void paint(Graphics g) {
    g.setColor(Color.BLACK);
    /*
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
     */
    for(int i = 0; i < polygons.size(); i++) {
      g.drawPolygon(polygons.get(i));
    }
  }
}


/*We will use `ArrayList` again!  Have the `Color` field of `Actor` changed to 
a list of polygons and initialise each subclass to an appropriate set of polygons.  
You might find the following polygons a useful starting point where `location` 
is the top-left point of the actor (but I am sure you can do better as well - 
share your designs on the forums!): */