public class Main {

  public static void main(String[] args) {
    Carrier IJNAkagi = new Carrier(2300, 5000);
    Carrier USSFranklyn = new Carrier(1800, 6000);

    IJNAkagi.addAircraft(Carrier.F16, 1);
    IJNAkagi.addAircraft(Carrier.F35, 3);
    IJNAkagi.getStatus();

    USSFranklyn.addAircraft(Carrier.F16, 3);
    USSFranklyn.addAircraft(Carrier.F35, 1);
    USSFranklyn.getStatus();

    IJNAkagi.fill();
    IJNAkagi.getStatus();

    USSFranklyn.fill();
    IJNAkagi.getStatus();

    IJNAkagi.fight(IJNAkagi,USSFranklyn);
    IJNAkagi.getStatus();
    USSFranklyn.getStatus();

  }
}
