import Course.{East, North, South, West}
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

  "robotSimulator.robotSouth" should "move left" in {
    robotSouth.turnLeft shouldBe RobotSimulator(East, (0, 0))
  }

  it should "move right" in {
    robotSouth.turnRight shouldBe RobotSimulator(West, (0, 0))
  }

  it should "return advance" in {
    robotSouth.advance shouldBe RobotSimulator(South, (1, 0))
  }

  "robotSimulator.robotEast" should "move left" in {
    robotEast.turnLeft shouldBe RobotSimulator(North, (0, 0))
  }

  it should "move right" in {
    robotEast.turnRight shouldBe RobotSimulator(South, (0, 0))
  }

  it should "return advance" in {
    robotEast.advance shouldBe RobotSimulator(East, (0, -1))
  }

  "robotSimulator.robotWest" should "move left" in {
    robotWest.turnLeft shouldBe RobotSimulator(South, (0, 0))
  }

  it should "move right" in {
    robotWest.turnRight shouldBe RobotSimulator(North, (0, 0))
  }

  it should "return advance" in {
    robotWest.advance shouldBe RobotSimulator(West, (-1, 0))
  }

}