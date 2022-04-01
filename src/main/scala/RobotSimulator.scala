sealed trait Course

case object Course {
  object North extends Course

  object East extends Course

  object South extends Course

  object West extends Course
}

case class Robot(direction: Course, position: (Int, Int)) {

  import Course._

  def advance: Robot = ???

  def turnLeft: Robot = direction match {
    case North => copy(West)
    case South => copy(East)
    case East => copy(North)
    case West => copy(South)
  }

  def turnRight: Robot = direction match {
    case North => copy(East)
    case South => copy(West)
    case East => copy(South)
    case West => copy(North)
  }

  def robotSimulator(course: String): Robot = {
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
