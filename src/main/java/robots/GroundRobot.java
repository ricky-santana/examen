package robots;

import robots.types.TractionType;

import java.time.LocalDate;
import java.time.Year;

public class GroundRobot extends Robot implements ResistanceEvaluable{
    private final int maxSpeed;
    private final TractionType tractionType;


    public GroundRobot(String name, String manufacturer, Year fabricationYear, LocalDate inscriptionDate, int maxSpeed, TractionType tractionType) {
        super(name, manufacturer, fabricationYear, inscriptionDate);
        this.maxSpeed = maxSpeed;
        this.tractionType = tractionType;
    }
//“TankBot, fabricado por RoboCorp en 2022, usa tracción ORUGAS y alcanza hasta 40 km/h.”
    @Override
    public String getTechnicalDescription() {
        return getName() + ", fabricado por " + getManufacturer() + " en " + getFabricationYear() +
                ", usa tracción " + this.tractionType.toString() + " y alcanza hasta " + this.maxSpeed + " km/h.";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getResistanceReport() {
        String aptOrnot = (tractionType == TractionType.ORUGA)? "Apto para la competición.": "No cumple los requisitos.";
        return this.getName() + ": tracción " + tractionType.toString() + " confirmada. " + aptOrnot;
    }

}
