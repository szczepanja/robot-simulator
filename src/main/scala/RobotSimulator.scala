sealed trait Course

case object Course {
  object North extends Course

  object East extends Course

  object South extends Course

  object West extends Course
}

case class Robot(direction: Course, position: (Int, Int)) {

  def advance: Robot = ???

  def turnRight: Robot = ???

  def turnLeft: Robot = ???

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
