import Course.{East, North, West}
import org.scalatest._
import flatspec._
import matchers._

class RobotSimulatorSpec extends AnyFlatSpec with should.Matchers {

  import RobotSimulator._

  "robotSimulator.robotNorth" should "move left" in {
    robotNorth.turnLeft shouldBe RobotSimulator(West, (0, 0))
  }

  it should "move right" in {
    robotNorth.turnRight shouldBe RobotSimulator(East, (0, 0))
  }

  it should "return advance" in {
    robotNorth.advance shouldBe RobotSimulator(North, (0, 1))
  }

}