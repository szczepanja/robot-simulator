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
    case South => copy(East)
    case East => copy(North)
    case West => copy(South)
  }

  def turnRight: RobotSimulator = direction match {
    case North => copy(East)
    case South => copy(West)
    case East => copy(South)
    case West => copy(North)
  }

  def robotSimulator(course: String): RobotSimulator = {
    course.toList.foldLeft(this) {
      (result, c) =>
        c match {
          case "left" => result.turnLeft
          case "right" => result.turnRight
          case "advance" => result.advance
        }
    }
  }
}
