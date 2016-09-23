import org.scalatest.{FlatSpec, Matchers}
import Affine.AffineDecoder
/**
  * Created by Alkit on 9/8/2016.
  */
class AffineDecoderTest extends FlatSpec with Matchers {
  "A result" should "ATTACKATDAWN" in{
    val decoder = new AffineDecoder(9,4,26)
    decoder.decode("EJJEKIEJNESR") should be("ATTACKATDAWN")
  }
}
