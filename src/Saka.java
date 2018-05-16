import java.util.ArrayList;
import java.util.List;

public class Saka {

  private List <Saka> sakosVaikai = new ArrayList<>();
  private Saka tevas;

  public Saka gautiSaka(int i) {
    return sakosVaikai.get(i);
  }

  public void pridetiSaka(Saka saka){
    saka.setTevas(this);
    sakosVaikai.add(saka);
  }

  public int vaikuSkaicius(){
    if (sakosVaikai == null || sakosVaikai.isEmpty()){
      return 0;
    } else {
      return sakosVaikai.size();
    }
  }

  public boolean arSaka(){
    return vaikuSkaicius() > 0 && !arSaknis();
  }

  public boolean arLapas(){
    return vaikuSkaicius() == 0;
  }

  public boolean arSaknis(){
    return tevas == null;
  }

  public int getLygis() {
    if (arSaknis()) {
       return 1;
    } else {
      return tevas.getLygis() + 1;
    }
  }

  public List<Saka> getSakosVaikai() {
    return sakosVaikai;
  }

  public void setSakos(List<Saka> sakosVaikai) {
    this.sakosVaikai = sakosVaikai;
  }

  public Saka getTevas() {
    return tevas;
  }

  public void setTevas(Saka tevas) {
    this.tevas = tevas;
  }

}