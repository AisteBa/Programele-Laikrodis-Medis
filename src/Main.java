import java.util.Scanner;

public class Main {

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Main main = new Main();
    main.paleistiPrograma();
    main.closeScanner();
  }


  public void paleistiPrograma() {
    boolean run = true;
    while (run) {
      spausdinkMenu();
      int input = scanner.nextInt();
      switch (input) {
        case 1:
          paskaiciuokMazesnijiKampaTarpRodykliu();
          break;
        case 2:
          paskaiciuokMedzioAuksti();
          break;
        case 3:
          run = false;
          break;
        default:
          System.out.println("Blogai pasirinktas meniu punktas");
      }
    }
  }


  public void spausdinkMenu() {
    System.out.println("-----------------------------------------------------------");
    System.out.println("Pasirinkite, ką norite daryti: ");
    System.out.println("1. Skaičiuoti kampą tarp analoginio laikrodžio rodyklių");
    System.out.println("2. Skaičiuoti medžio aukštį");
    System.out.println("3. Išeiti iš programos");
    System.out.println("-----------------------------------------------------------");
  }

  public void paskaiciuokMedzioAuksti() {
    Medis medis = MedzioKurimas.sukurtiBelenkokiMedi();
    System.out.println("Medžio aukščiausias lygis yra: " + medis.apskaiciuokAuksti());
  }

  public void paskaiciuokMazesnijiKampaTarpRodykliu() {
    System.out.println("Įveskite valandas (nuo 1 iki 12) ir minutes");
    int valandos = scanner.nextInt();
    int minutes = scanner.nextInt();
    try {
      double rezultatas = Laikrodis.apskaiciuokKampaTarpRodykliu(valandos, minutes);
      System.out.println(
          "Kampas tarp valandinės ir minutinės rodyklės yra " + rezultatas + " laipsnių (-iai)");
      System.out.println();
    } catch (IllegalArgumentException ex) {
      System.out.println("Blogai įvestos valandos arba minutės: " + ex.getMessage());
    }
  }

  public void closeScanner() {
    scanner.close();
  }

}
