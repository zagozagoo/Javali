class Main
{
  public static void main(String[] args)
  {
    Robot robot = new Robot();
    Robot robot2 = new Robot();

    robot.setState(State.ON);
    robot2.setState(State.ON);
    
    robot.move(Movement.FAST);  
    robot.rotate(Rotation.LEFT30);
    robot.rotate(Rotation.LEFT30);
    robot.rotate(Rotation.LEFT30);
    robot.move(Movement.SLOW);

    robot2.move(Movement.SLOW);
    robot2.rotate(Rotation.RIGHT15);
    robot2.move(Movement.SLOW);

    robot.moveAll(Movement.FAST);
    
    System.out.println(robot.x);
    System.out.println(robot.y);

    System.out.println(robot2.x);
    System.out.println(robot2.y);
  }
}