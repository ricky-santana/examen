package robots;

import java.time.LocalDate;
import java.time.Year;

public abstract class Robot {
    private final String name;
    private final String manufacturer;
    private final Year fabricationYear;
    private final LocalDate inscriptionDate;

    public Robot(String name, String manufacturer, Year fabricationYear, LocalDate inscriptionDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.fabricationYear = fabricationYear;
        this.inscriptionDate = inscriptionDate;
    }

    public abstract String getTechnicalDescription();

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Year getFabricationYear() {
        return fabricationYear;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }
}
