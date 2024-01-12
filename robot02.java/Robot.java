import java.lang.Math;
import java.util.LinkedList;

public class Robot
{
  private State state;
  private int robotRotation;
  public int x = 0;
  public int y = 0;

  private static LinkedList<Robot> robots = new LinkedList<>();

  public void setState(State value)
  {
    this.state = value;
  }

  public Robot()
  {
    this.state = State.OFF;
    robots.add(this);
  }

  public void rotate(Rotation rotation)
  {
    if (state != State.ON)
      return;

    robotRotation += rotation.getAngulo();
    
  }

  public void move(Movement movement)
  {
    if (state != State.ON)
      return;

    x += Math.cos(Math.toRadians(robotRotation)) * movement.getVelocidade(); //+= pq guarda o valor dele mesmo
    y += Math.sin(Math.toRadians(robotRotation)) * movement.getVelocidade();
  }

  public void moveAll(Movement movement) {
    if (state.equals(State.OFF))
      return;

    for (Robot robot : robots) {
      robot.move(movement);
    }
  }
  
}