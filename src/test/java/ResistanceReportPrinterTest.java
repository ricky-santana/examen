import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import robots.AirRobot;
import robots.GroundRobot;
import robots.ResistanceEvaluable;
import robots.Robot;
import robots.types.TractionType;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ResistanceReportPrinterTest {
    private ResistanceEvaluable airRobot;
    private ResistanceEvaluable airRobotB;
    private ResistanceEvaluable groundRobot;
    private List<ResistanceEvaluable> robotList;
    private ResistanceReportPrinter printer;

    @BeforeEach
    void init (){
        airRobot = new AirRobot("SkyX-1", "AeroDynamics", Year.of(2023),
                LocalDate.of(2024, 2, 23), 3000, 75);
        airRobotB = new AirRobot("FlyBot-3", "AeroDynamics", Year.of(2023),
                LocalDate.of(2024, 2, 23), 3000, 45);
        groundRobot = new GroundRobot("T-1000", "RoboCorp",
                Year.of(2022), LocalDate.of(2023, 2, 27), 40, TractionType.ORUGA);
        robotList = List.of(airRobot, airRobotB, groundRobot);
        printer = new ResistanceReportPrinter();
    }

    @Test
    void shouldReturnReport(){

        String expected = "=== Resilience Test Reports ===\n" +
                "SkyX-1: autonomía de 75 minutos. Apto para la competición.\n" +
                "FlyBot-3: autonomía de 45 minutos. No cumple los requisitos.\n" +
                "T-1000: tracción oruga confirmada. Apto para la competición.";

        Assertions.assertEquals(expected, printer.printReport(robotList));
    }

}
