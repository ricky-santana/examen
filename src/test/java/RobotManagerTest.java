import exceptions.EmptyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import robots.AirRobot;
import robots.GroundRobot;
import robots.Robot;
import robots.WatherRobot;
import robots.types.PropulsionType;
import robots.types.TractionType;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class RobotManagerTest {
    private Robot airRobot;
    private Robot groundRobot;
    private Robot watherRobot;
    private List<Robot> robotList;
    private RobotManager manager;

    @BeforeEach
    void init (){
        airRobot = new AirRobot("SkyDancer", "AeroDynamics", Year.of(2023),
                LocalDate.of(2024, 2, 23), 3000, 90);
        groundRobot = new GroundRobot("TankBot", "RoboCorp",
                Year.of(2022), LocalDate.of(2023, 2, 27), 40, TractionType.ORUGA);
        watherRobot = new WatherRobot("AquaRunner", "AquaTech", Year.of(2021),
                LocalDate.of(2023, 12, 23), 500, PropulsionType.HELICE);
        robotList = new ArrayList<>(List.of(airRobot, groundRobot, watherRobot));
        manager = new RobotManager(robotList);
    }

    @Test
    void shouldGetAllTechnicalDescription(){
        String expected = "SkyDancer vuela hasta 3000 m durante 90 minutos. Fabricado en 2023 por AeroDynamics.\n" +
                "TankBot, fabricado por RoboCorp en 2022, usa tracción oruga y alcanza hasta 40 km/h.\n" +
                "AquaRunner alcanza una profundidad de 500 m con propulsión tipo hélice. Fabricado por AquaTech en 2021.";
        Assertions.assertEquals(expected, manager.getAllTechnicalDescription());
    }
    @Test
    void shouldThrowException(){
        robotList.clear();
        Assertions.assertThrows(EmptyList.class, ()-> manager.getAllTechnicalDescription());
    }
    @Test
    void shouldReturGroundRobotListBySpeed(){
        List<GroundRobot> expected = new ArrayList<GroundRobot>();
        expected.add((GroundRobot) groundRobot);

        Assertions.assertEquals(expected, manager.getGroundRobotListBySpeed(35));

    }

    @Test
    void shouldReturRobotsByManufacturer(){
        List<Robot> expected = new ArrayList<>(List.of(watherRobot));

        Assertions.assertEquals(expected, manager.getRobotsByManufacturer("AquaTech"));
    }
}
