import java.util.HashMap;

public class Hashmatique {

  private static HashMap<String, String> trackList = new HashMap<String, String>();

  public static void main(String[] args) {

    Hashmatique my_hash = new Hashmatique();
    my_hash.addSongs();
    my_hash.printSong();
    my_hash.printSongs();
  }

  public void addSongs() {
    trackList.put("Rockstar", "Im done with standing in line at clubs Ill never get in.");
    trackList.put("Control", "I love the way you look at me.");
    trackList.put("Behind Blue Eyes", "Noone knows what its like to be the bad man.");
    trackList.put("Black Sun", "Theres whiskey in the water, and there is death upon the vine.");
  }

  public void printSong() {
    System.out.println(trackList.get("Control"));
  }

  public void printSongs() {
    for(String key : trackList.keySet()) {
               System.out.println(key + " : " + trackList.get(key));
    }
  }
}
