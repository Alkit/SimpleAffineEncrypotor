import org.scalatest.{FlatSpec, Matchers}
import Affine.AffineCoder
/**
  * Created by Alkit on 9/7/2016.
  */
class AffineCoderTest extends FlatSpec with Matchers{
  "A result " should "be EJJEKIEJNESR" in {
    val coder = new AffineCoder(3,4,26)
    coder.encode("ATTACK AT DAWN") should be ("EJJEKIEJNESR")
  }

}
