import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Enemy {
    Color color;
    Cell loc;
    List<Polygon> display;

    public void paint(Graphics g) {
        for(Polygon p: display) {
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(new Color(255, 0, 0, 125));
            g.drawPolygon(p);
        }
    }
}
