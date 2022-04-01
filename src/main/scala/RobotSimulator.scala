import Course._

case class RobotSimulator(direction: Course, position: (Int, Int)) {

  def advance: RobotSimulator = {
    val (x, y) = position
    direction match {
      case North => RobotSimulator(North, (x, y + 1))
      case East => RobotSimulator(East, (x, y - 1))
      case South => RobotSimulator(South, (x + 1, y))
      case West => RobotSimulator(West, (x - 1, y))
    }
  }

  def turnLeft: RobotSimulator = direction match {
    case North => copy(West)
    case East => copy(North)
    case South => copy(East)
    case West => copy(South)
  }

  def turnRight: RobotSimulator = direction match {
    case North => copy(East)
    case East => copy(South)
    case South => copy(West)
    case West => copy(North)
  }

  def robotSimulator(course: String): RobotSimulator = {
    course.toList.foldLeft(this) {
      (result, c) =>
        c match {
          case 'l' => result.turnLeft
          case 'r' => result.turnRight
          case 'a' => result.advance
        }
    }
  }
}

object RobotSimulator {
  val robotNorth = new RobotSimulator(direction = North, position = (0, 0))
  val robotEast = new RobotSimulator(direction = East, position = (0, 0))
  val robotSouth = new RobotSimulator(direction = South, position = (0, 0))
  val robotWest = new RobotSimulator(direction = West, position = (0, 0))
}
