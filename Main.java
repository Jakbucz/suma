import java.util.Scanner;

  class Main {
  
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj liczbę: ");
    int a = scanner.nextInt();

    System.out.print("Podaj następną liczbę: ");
    int b = scanner.nextInt();

    int suma = a + b;

    System.out.print("Suma liczb " + a + "i" + b + "wynosi: " + suma);
  }
  }