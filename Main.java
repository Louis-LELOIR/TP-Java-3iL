import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez un float : ");
    if (scanner.hasNextDouble()) {
      double d = scanner.nextDouble();
      System.out.println(d + Double.MIN_NORMAL);
      System.out.println(d - Double.MIN_NORMAL);
    }
    scanner.close();
  }
}