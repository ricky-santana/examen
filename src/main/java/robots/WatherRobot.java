package robots;

import robots.types.PropulsionType;

import java.time.LocalDate;
import java.time.Year;

public class WatherRobot extends Robot{
    private final int maxDiveDistance;
    private final PropulsionType propulsionType;

    public WatherRobot(String name, String manufacturer, Year fabricationYear, LocalDate inscriptionDate, int maxDiveDistance, PropulsionType propulsionType) {
        super(name, manufacturer, fabricationYear, inscriptionDate);
        this.maxDiveDistance = maxDiveDistance;
        this.propulsionType = propulsionType;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + " alcanza una profundidad de " + this.maxDiveDistance + " m con propulsión tipo "
                + this.propulsionType.toString() + ". Fabricado por " + getManufacturer() + " en " + getFabricationYear() + ".";
    }
}
