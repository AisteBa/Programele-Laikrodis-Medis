public class Laikrodis {

  public static double apskaiciuokKampaTarpRodykliu(int valandos, int minutes){
    if (valandos >= 0 && valandos <= 12 && minutes >= 0 && minutes < 60) {
      double valandinesRodyklesLaipsnis = 0.5 * (60 * valandos + minutes);
      double minutinesRodyklesLaipsnis = 6 * minutes;
      double kampasTarpLaikrodzioRodykliu = valandinesRodyklesLaipsnis - minutinesRodyklesLaipsnis;

      if (kampasTarpLaikrodzioRodykliu < 0) {
        return kampasTarpLaikrodzioRodykliu * (-1);
      } else if (kampasTarpLaikrodzioRodykliu > 180) {
        return 360 - kampasTarpLaikrodzioRodykliu;
      } else {
        return kampasTarpLaikrodzioRodykliu;
      }

    } else {
      throw new IllegalArgumentException("Netinkamai nurodyta valanda arba minutes");
    }
  }

}
