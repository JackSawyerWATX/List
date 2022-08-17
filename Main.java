import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String[] args) {

        ArrayList<String> instruments = new ArrayList<String>();
        System.out.println();
        // You can create a string with a name then add it to the arraylist.
    String drums = "Drums";
    instruments.add(drums);
    String violin = "Violin";
    instruments.add(violin);

    // You can also create the string while adding it to the arraylist as well
    instruments.add("Guitar");
    instruments.add(new String("Piano"));

    for (int i = 0; i < instruments.size(); i++) {
      System.out.println(instruments.get(i));
    }

    instruments.remove("Violin");

    System.out.println();
      for (int i = 0; i < instruments.size(); i++) {
    System.out.println(instruments.get(i));
      }

    instruments.remove(1);

    System.out.println();
      for (int i = 0; i < instruments.size(); i++) {
    System.out.println(instruments.get(i));
      }

      System.out.println();

    ArrayList<Integer> randomNums = new ArrayList<Integer>();

    randomNums.add(15);
    randomNums.add(22);
    randomNums.add(99);
    randomNums.add(75);
    randomNums.add(16);
    randomNums.add(2);

    for(Integer nums: randomNums){
      System.out.println(nums);
    }
        System.out.println();

      Collections.reverse(randomNums);

      for(int index = 0; index < randomNums.size(); index++){
        System.out.println(randomNums.get(index));
    }
    System.out.println();
  }
}