import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Item<T> {
    Color color;
    Cell loc;
    List<Polygon> display;
    T attribute;

    public Item(T attribute){
        this.attribute = attribute;
    }

    public void paint(Graphics g) {
        for(Polygon p: display) {
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(Color.GRAY);
            g.drawPolygon(p);
        }
    }
}
