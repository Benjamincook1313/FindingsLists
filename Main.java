import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);

    Thread.sleep(500);
    System.out.println("Welcome back from your expedition. Time to catalog everything you found,");

    ArrayList<String> rockList = new ArrayList<String>();

    System.out.println("Rock data downloaded.\n");

    rockList.add("rock");
    rockList.add("weird rock");
    rockList.add("smooth rock");
    rockList.add("not rock");

    for(int i=0; i<rockList.size(); i++) {
      System.out.println("rock #" + (i+1) + ": " + rockList.get(i));
    }

    System.out.println("\nWait a second that last one is not a rock we need to delete that one from the list.\n");
    rockList.remove("not rock");

    for(int i=0; i<rockList.size(); i++) {
      System.out.println("rock #" + (i+1) + ": " + rockList.get(i));
    }

    System.out.println("\nPerfect!");
    Thread.sleep(500);

    HashMap<String, String> fossilDirectory = new HashMap<String, String>();
    System.out.println("\nFossil data downloaded");

    fossilDirectory.put("Bird Fossil", "The fossil has wings, implying it was capable of flight.");
    fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped, implies there was once water.");
    fossilDirectory.put("Tooth Fossil", "The tooth from an unknown creature.");

    System.out.println("which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

    String fossilChoice = input.nextLine();

      if(fossilDirectory.containsKey(fossilChoice)){
        System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
      } else {
        System.out.println("That doesn't match our records");
      }

    Thread.sleep(500);

    System.out.println("\nYou brought some supplies and have used some, this is what is left over?");
    HashSet<String> suppliesBrought = new HashSet<String>();
    HashSet<String> suppliesUsed = new HashSet<String>();

    suppliesBrought.add("Food");
    suppliesBrought.add("Water");
    suppliesBrought.add("Medicine");

    suppliesUsed.add("Food");
    suppliesUsed.add("Water");

    for(String item : suppliesBrought){
      if(!suppliesUsed.contains(item)){
        System.out.println(item);
      }
    }

    new FindingsLists();

  }
}
