import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import robots.GroundRobot;
import robots.Robot;
import robots.types.TractionType;
import java.time.LocalDate;
import java.time.Year;

public class GroundRobotTest {
    private Robot groundRobot;

    @BeforeEach
    void init(){
        groundRobot = new GroundRobot("TankBot", "RoboCorp",
                Year.of(2022), LocalDate.of(2023, 2, 27), 40, TractionType.ORUGA);
    }

    @Test
    void shouldReturnTechnicalDescription(){
        String expected = "TankBot, fabricado por RoboCorp en 2022, usa tracción oruga y alcanza hasta 40 km/h.";

        Assertions.assertEquals(expected, groundRobot.getTechnicalDescription());
    }

}
