package robots;

import java.time.LocalDate;
import java.time.Year;

public class AirRobot extends Robot implements ResistanceEvaluable{
    private final int maxAltitude;
    private final int autonomy;

    public AirRobot(String name, String manufacturer, Year fabricationYear, LocalDate inscriptionDate, int maxAltitude, int autonomy) {
        super(name, manufacturer, fabricationYear, inscriptionDate);
        this.maxAltitude = maxAltitude;
        this.autonomy = autonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + " vuela hasta " + this.maxAltitude + " m durante " + this.autonomy
                + " minutos. Fabricado en " + getFabricationYear() + " por " + getManufacturer() + ".";
    }

    @Override
    public String getResistanceReport() {
        String aptOrnOt = (this.autonomy >= 60)? "Apto para la competición.": "No cumple los requisitos.";
        return getName() + ": autonomía de " + this.autonomy + " minutos. " + aptOrnOt;
    }
}
