import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;
  List<Actor> listOfActors;

  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
    listOfActors = new ArrayList<>();
    listOfActors.add(cat);
    listOfActors.add(dog);
    listOfActors.add(bird);

  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    /*cat.paint(g);
    dog.paint(g);
    bird.paint(g);*/
    
    for(int i = 0; i < listOfActors.size(); i++) {
      listOfActors.get(i).paint(g);
    }
    Integer xpos = grid.cellAtPoint(mouseLoc).get().x;
    Integer ypos = grid.cellAtPoint(mouseLoc).get().y;

    g.drawString("X Position: " + xpos.toString(), 750, 200);
    g.drawString("Y Position: " + ypos.toString(), 750, 250);

  }
}
