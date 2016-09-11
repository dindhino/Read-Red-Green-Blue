/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readrgb;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Dhino
 */
public class ReadRGB extends Component {

    public ReadRGB() {
        try {
            BufferedImage image = ImageIO.read(this.getClass().getResource("a.png"));
            marchThroughImage(image);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void getRed(int pixel) {
        int red = (pixel >> 16) & 0xff;
        System.out.print(red);
    }

    public void getGreen(int pixel) {
        int green = (pixel >> 8) & 0xff;
        System.out.print(green);
    }

    public void getBlue(int pixel) {
        int blue = (pixel) & 0xff;
        System.out.print(blue);
    }

    private void marchThroughImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        System.out.println("width, height: " + w + ", " + h);
        System.out.println("");
        System.out.println("Red : ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int pixel = image.getRGB(j, i);
                getRed(pixel);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Green : ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int pixel = image.getRGB(j, i);
                getGreen(pixel);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Blue : ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int pixel = image.getRGB(j, i);
                getBlue(pixel);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReadRGB readRGB = new ReadRGB();
    }

}
