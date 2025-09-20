import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class Image {
    BufferedImage img;

    public Image(String path){
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.err.println("Could not load image: " + path);
        }
    }
    
    public BufferedImage getImage() {
        return img;
    }
}