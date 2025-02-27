import org.code.theater.*;
import org.code.media.*;
 /*
 * Represents an image that can be modified with filters and effects
 */
public class ImagePlus extends Image {
  private Pixel[][] pixels; 

  /*
  * Constructor to create an ImagePlus object
  * Has a specific file name
  * Getting the pixels from the image
  */
  public ImagePlus(String filename) {
    super(filename);

    pixels = getPixels();
  }

  /* 
  * Constructor to create an ImagePlus
  * Has a specific height and width
  */

  public ImagePlus(int width, int height) {
    super(width, height);
    pixels = getPixels();
  }

  /*
  * Returns the pixels in the image as a 2D array of objects
  */
  public Pixel[][] getPixels() {
    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];

    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }

    return tempPixels;
  }

  /*
   * Returns the pixels in the image as a 2D array of Pixel objects
   */
  public Pixel[][] getPixelsFromImage() {
    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
   
    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }

    return tempPixels;
  }

  /*
  * removes red 
  * from the image 
  */
  public void zeroRed() {
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        currentPixel.setRed(0);
      }
    }
  }

  /*
  * removes green 
  * from the image
  */
  public void zeroGreen() {
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        currentPixel.setGreen(0);
      }
    }
  }

  /*
  * removes blue 
  * from the image
  */
    public void zeroBlue() {
      for (int row = 0; row < pixels.length; row++) {
        for (int col = 0; col < pixels[0].length; col++) {
          Pixel currentPixel = pixels[row][col];

          currentPixel.setRed(0);
          currentPixel.setGreen(0);
        }
      }
    }
        



  
}
