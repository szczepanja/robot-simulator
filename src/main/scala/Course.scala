sealed trait Course

case object Course {
  object North extends Course

  object East extends Course

  object South extends Course

  object West extends Course
}
