sealed trait Course

case object Course {
  case object North extends Course

  case object East extends Course

  case object South extends Course

  case object West extends Course
}

case class RobotSimulator(direction: Course, position: (Int, Int))

