import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import robots.Robot;
import robots.WatherRobot;
import robots.types.PropulsionType;

import java.time.LocalDate;
import java.time.Year;

public class WatherRobotTest {
    private Robot watherRobot;

    @BeforeEach
    void init (){
        watherRobot = new WatherRobot("AquaRunner", "AquaTech", Year.of(2021),
                LocalDate.of(2023, 12, 23), 500, PropulsionType.HELICE);
    }

    @Test
    void shouldReturnTechnicalDescription(){
        String expected = "AquaRunner alcanza una profundidad de 500 m con propulsión tipo hélice. Fabricado por AquaTech en 2021.";
        Assertions.assertEquals(expected, watherRobot.getTechnicalDescription());
    }
}
