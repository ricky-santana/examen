import exceptions.EmptyList;
import robots.GroundRobot;
import robots.Robot;

import java.util.List;
import java.util.stream.Collectors;

public class RobotManager {
    private List<Robot> robotList;

    public RobotManager(List<Robot> robotList) {
        this.robotList = robotList;
    }

    public String getAllTechnicalDescription(){
        checkList();
        return robotList.stream()
                .map(Robot::getTechnicalDescription)
                .collect(Collectors.joining("\n"));
    }

    public List<GroundRobot> getGroundRobotListBySpeed (int maxSpeed){
        return robotList.stream()
                .filter(GroundRobot.class::isInstance)
                .map(GroundRobot.class::cast)
                .filter(groundRobot -> groundRobot.getMaxSpeed() > maxSpeed)
                .toList();
    }

    public List<Robot> getRobotsByManufacturer (String manufacturer){
        return robotList.stream()
                .filter(robot -> robot.getManufacturer().equals(manufacturer))
                .toList();
    }

    public void checkList(){
        if (robotList.isEmpty()){
            throw new EmptyList();
        }
    }
}
