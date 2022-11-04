import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int nombre = 0;
    nombre = scanner.nextInt();
    for(int i = 1 ; i <= 10 ; i++){
      System.out.println(nombre * i);
    }
  }
}