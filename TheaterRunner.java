import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  /*
   * 2D arrays of images,
   * names, and audios
   */
    String[][] hawaiiImages = {{"kauai.jpg", "maui.jpg", "oahu.jpg", "Lanai.jpg"}};
    String[][] imageNames = {{"Kauai", "Maui", "Oahu", "Lanai"}};
    String[][] soundFiles = {{"CAT1.wav", "leopard.wav", "lynx.wav", "cat14.wav"}};

  /*
   * Instantiates scene object
   * and displays scene in theater
   */
    NarrativeScene scene = new NarrativeScene(hawaiiImages, imageNames, soundFiles);
    scene.createScene();

    Theater.playScenes(scene);


    
  }
}