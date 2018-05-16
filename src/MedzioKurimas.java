public class MedzioKurimas {

  public static Medis sukurtiBelenkokiMedi(){
    Medis medis = new Medis();

    medis.getSaknis().pridetiSaka(new Saka());
    medis.getSaknis().pridetiSaka(new Saka());
    medis.getSaknis().pridetiSaka(new Saka());
    medis.getSaknis().gautiSaka(1).pridetiSaka(new Saka());
    medis.getSaknis().gautiSaka(1).pridetiSaka(new Saka());
    medis.getSaknis().gautiSaka(1).gautiSaka(1).pridetiSaka(new Saka());
    medis.getSaknis().gautiSaka(1).gautiSaka(1).pridetiSaka(new Saka());

    return medis;
  }

}
