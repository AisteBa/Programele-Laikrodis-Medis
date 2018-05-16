public class Medis {

  private Saka saknis = new Saka();

  public Saka getSaknis() {
    return saknis;
  }

  public void setSaknis(Saka saknis) {
    this.saknis = saknis;
  }

  public int apskaiciuokAuksti() {
    return apskaiciuokAuksti(saknis);
  }

  public int apskaiciuokAuksti(Saka saknis) {
    int height = 0;
    if (saknis == null) {
      return height;
    }
    if (saknis.arLapas()) {
      return 1;
    }
    for (Saka vaikas : saknis.getSakosVaikai()) {
      height = Math.max(height, apskaiciuokAuksti(vaikas));
    }
    return height + 1;
  }

}
