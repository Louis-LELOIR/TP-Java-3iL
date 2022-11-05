package org.tp_java_3il;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger(Main.class.getName());
    logger.log(Level.INFO, "ex38() method returned : {0}", ex38("aabbbccccdeeeee"));
  }

  public static String ex38(String input){
    String[] arrayWithDuplicates = input.split("");

    Set<String> arrayOfUniqueValues = getUnique(arrayWithDuplicates);

    StringBuilder returnValue = new StringBuilder();
    for (String value : arrayOfUniqueValues) {
      returnValue.append(value);
      int count = 0;
      for(int i = 0; i < arrayWithDuplicates.length; i++) {
        int idx = arrayWithDuplicates[i].indexOf(value);
        if (idx != -1) { count++;}
      }
      returnValue.append(Integer.toString(count));
    }

    return returnValue.toString();
  }

  static Set<String> getUnique(String[] arr) {
    Set<String> values = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
     if (!values.contains(arr[i])) {
      values.add(arr[i]);
     }
    }
    return values;
   }
}