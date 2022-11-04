import java.util.Arrays;
import java.util.*;

class Main {
  public static void main(String[] args) {
    String sentence = "Le chien dans la niche";
    String [] tempArray = sentence.split(" ");

    StringBuilder reversed = new StringBuilder();

    for (int i = tempArray.length; i > 0; i--) {
          reversed.append(tempArray[i - 1]).append(" ");
    };
        
    String[] reversedArray = reversed.toString().split(" ");

    for (String word : reversedArray) {
      System.out.println(word);
    }
  }
}