import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**ArrayList<Aircraft> e2cHawkeye = new ArrayList<>();
        ArrayList<Aircraft> ussEnterprise = new ArrayList<>();

        e2cHawkeye.add(new Aircraft("F16"));
        e2cHawkeye.add(new Aircraft("F16"));
        e2cHawkeye.add(new Aircraft("F16"));
        e2cHawkeye.add(new Aircraft("F35"));
        e2cHawkeye.add(new Aircraft("F35"));

        ussEnterprise.add(new Aircraft("F16"));
        ussEnterprise.add(new Aircraft("F16"));
        ussEnterprise.add(new Aircraft("F16"));
        ussEnterprise.add(new Aircraft("F35"));
        ussEnterprise.add(new Aircraft("F35"));**/


        /**for (Aircraft currentAircraft : e2cHawkeye) {
            currentAircraft.refill(300);
            currentAircraft.fight(currentAircraft.getAmmo());
            currentAircraft.getStatus();
            currentAircraft.refill(300);
            currentAircraft.getStatus();
        }**/

        Carrier e2cHawkeye = new Carrier(2300, 5000);
        e2cHawkeye.addAircraft(new Aircraft("F16"));
        e2cHawkeye.addAircraft(new Aircraft("F16"));
        e2cHawkeye.addAircraft(new Aircraft("F16"));
        e2cHawkeye.addAircraft(new Aircraft("F16"));
        e2cHawkeye.addAircraft(new Aircraft("F16"));
        e2cHawkeye.addAircraft(new Aircraft("F35"));
        e2cHawkeye.addAircraft(new Aircraft("F35"));
        e2cHawkeye.fill();
        e2cHawkeye.getStatus();
        for (Aircraft currentAircraft : e2cHawkeye.getAircrafts()) {
            currentAircraft.getStatus();
        }


        Carrier ussEnterprise = new Carrier(12, 8000);
        ussEnterprise.addAircraft(new Aircraft("F16"));
        ussEnterprise.addAircraft(new Aircraft("F16"));
        ussEnterprise.addAircraft(new Aircraft("F35"));
        ussEnterprise.addAircraft(new Aircraft("F35"));
        ussEnterprise.addAircraft(new Aircraft("F35"));
        ussEnterprise.addAircraft(new Aircraft("F35"));

        ussEnterprise.fill();
        ussEnterprise.getStatus();
        for (Aircraft currentAircraft : ussEnterprise.getAircrafts()) {
            currentAircraft.getStatus();
        }

        ussEnterprise.fight(ussEnterprise,e2cHawkeye);
        ussEnterprise.getStatus();
        e2cHawkeye.getStatus();
    }
}
