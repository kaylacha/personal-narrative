import org.code.theater.*;
import org.code.media.*;

/*
* Represents a class in a narrative 
* scene in theater
*/
public class NarrativeScene extends Scene {
  String[][] images;
  String[][] names;
  String[][] sounds;

/*
* Constructor to initialize images
* names, and sounds
*/
  public NarrativeScene(String[][] images, String[][] names, String[][] sounds) {
    this.images = images;
    this.names = names;
    this.sounds = sounds; 
    
  }

  /*
   * Shows all images, applies filters,
   * displays names, and plays sounds
   */
   public void showKauai() {
    FilterImage kauaiImage = new FilterImage(images[0][0]);
    drawImage(kauaiImage, 0, 0, getWidth(), getHeight(), 0);
    playSound(sounds[0][0]);
    drawText(names[0][0], 10, 30);
    pause(2);

    kauaiImage.colorShift(60);
    drawImage(kauaiImage, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
  * Shows red blur filter to Maui image
  */
  public void showMaui() {
    FilterImage mauiImage = new FilterImage(images[0][1]);
    drawImage(mauiImage, 0, 0, getWidth(), getHeight(), 0);
    playSound(sounds[0][1]);
    drawText(names[0][1], 10, 30);
    pause(2);

    mauiImage.redBlur();
    drawImage(mauiImage, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
  * Shows fade effect 
  * to the Oahu image
  */
  public void showOahu() {
    FilterImage oahuImage = new FilterImage(images[0][2]);
    drawImage(oahuImage, 0, 0, getWidth(), getHeight(), 0);
    playSound(sounds[0][2]);
    drawText(names[0][2], 10, 30);
    pause(2);

    oahuImage.fadeImage(50);
    drawImage(oahuImage, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
  * Shows threshold filter 
  * to Lanai image 
  */
  public void showLanai() {
    FilterImage lanaiImage = new FilterImage(images[0][3]);
    drawImage(lanaiImage, 0, 0, getWidth(), getHeight(), 0);
    playSound(sounds[0][3]);
    drawText(names[0][3], 10, 30);
    pause(2);

    lanaiImage.threshold(50);
    playSound(sounds[0][3]);
    drawImage(lanaiImage, 0, 0, getWidth(), getHeight(), 0);
    pause(2);
  }

  /*
  * Shows all scenes in order
  */
  public void createScene() {
    showKauai();
    showMaui();
    showOahu();
    showLanai();
    
    
  }
}
