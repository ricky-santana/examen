import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import robots.AirRobot;
import robots.Robot;

import java.time.LocalDate;
import java.time.Year;

public class AirRobotTest {
    private Robot airRobot;

    @BeforeEach
    void init (){
        airRobot = new AirRobot("SkyDancer", "AeroDynamics", Year.of(2023),
                LocalDate.of(2024, 2, 23), 3000, 90);
    }

    @Test
    void shouldReturnTechnicalDescription(){
        String expected = "SkyDancer vuela hasta 3000 m durante 90 minutos. Fabricado en 2023 por AeroDynamics.";
        Assertions.assertEquals(expected, airRobot.getTechnicalDescription());
    }

}
