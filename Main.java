import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(ex10());
  }

  static int sumOfInputs = 0 ;
  public static int ex10(){
    Scanner s = new Scanner(System.in);
    System.out.println("Entrez un nombre entier :");
    
    String input = s.nextLine();
    ArrayList<String> splitArrayInput = new ArrayList<>(Arrays.asList(input.split("")));
    
    splitArrayInput.forEach((value) -> sumOfInputs += Integer.parseInt(value));
    s.close();
    return sumOfInputs;
  }
}