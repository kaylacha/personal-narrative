import org.code.theater.*;
import org.code.media.*;

/*
* Class for filtering images 
* Applies the effects 
*/
public class FilterImage extends ImagePlus {
  
  public FilterImage(String filename) {
    super(filename);
  }

  /*
   * Blurs red image pixels
   */
  public void redBlur() {
    Pixel[][] pixels = getPixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        int redAmount = (int) (Math.random() * 225);
        pixels[row][col].setRed(redAmount);
      }
    }   
  }

  /*
   * Fades image pixels
   */
  public void fadeImage(int amount) {
    Pixel[][] pixels = getPixels();
    for (int row = 0; row < pixels.length; row++) {
        for (int col = 0; col < pixels[row].length; col++) {
            int red = Math.min(255, pixels[row][col].getRed() + amount);
            int green = Math.min(255, pixels[row][col].getGreen() + amount);
            int blue = Math.min(255, pixels[row][col].getBlue() + amount);
            
            pixels[row][col].setRed(red);
            pixels[row][col].setGreen(green);
            pixels[row][col].setBlue(blue);
        }
    }
}

  /*
   * Converts image to black and white
   */
  public void threshold(int value) {
    Pixel[][] pixels = getPixelsFromImage();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
       
        int red = pixels[row][col].getRed();
        int green = pixels[row][col].getGreen();
        int blue = pixels[row][col].getBlue();

        int average = (red + green + blue) / 3;

        if (average < value) {
          pixels[row][col].setRed(0);
          pixels[row][col].setGreen(0);
          pixels[row][col].setBlue(0);
        }
        else {
          pixels[row][col].setRed(255);
          pixels[row][col].setGreen(255);
          pixels[row][col].setBlue(255);
        }
      }
    }
  }

  /*
   * Shifts image pixels based on parameterized value
   */
  public void colorShift(int value) {
    int multiplier = 1;
    Pixel[][] pixels = getPixelsFromImage();

    for(int row = 0; row < pixels.length; row++) {
      for(int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        int currentRed = currentPixel.getRed();
        int currentGreen = currentPixel.getGreen();
        int currentBlue = currentPixel.getBlue();

        int newRed = Math.min(255, Math.max(0, currentRed + value));
        int newGreen = Math.min(255, Math.max(0, currentGreen + value));
        int newBlue = Math.min(255, Math.max(0, currentBlue + value));

        currentPixel.setRed(newRed);
        currentPixel.setBlue(newBlue);
        currentPixel.setGreen(newGreen);
      }
    }
   
  }
    
  
  
}
