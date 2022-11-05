import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    System.out.println(ex38());
  }

  public static String ex38(){
    String input = "aabbbccccdeeeee";
    String[] arrayWithDuplicates = input.split("");

    Set<String> arrayOfUniqueValues = getUnique(arrayWithDuplicates);

    String returnValue = "";
    for (String value : arrayOfUniqueValues) {
      returnValue += value;
      int count = 0;
      for(int i = 0; i < arrayWithDuplicates.length; i++) {
        int idx = arrayWithDuplicates[i].indexOf(value);
        while(idx != -1) {
          count++;
          idx = arrayWithDuplicates[i].indexOf(value, idx+value.length());
        }
      }
      returnValue += Integer.toString(count);
    }
    
    return returnValue;
  }

  static Set getUnique(String[] arr) {
    Set<String> values = new HashSet();
    for (int i = 0; i < arr.length; i++) {
     if (!values.contains(arr[i])) {
      values.add(arr[i]);
     }
    }
    return values;
   }
}