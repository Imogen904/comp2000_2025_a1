import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Enemy<T> {
    Color color;
    Cell loc;
    List<Polygon> display;
    T item;

    public Enemy(T item) {
        this.item = item;
    }

    public void paint(Graphics g) {
        for(Polygon p: display) {
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(new Color(255, 0, 0, 125));
            g.drawPolygon(p);
        }
    }

    public T getItem() {
        return item;
    }
}