import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Alkit on 9/17/2016.
  */
class GCDTest extends FlatSpec with Matchers {
  val gCDTest = new GCD()
  "Result" should "modular" in {

    val result = gCDTest.modInv(3, 26)
    print(result)
    //result should be (9)
  }

}
