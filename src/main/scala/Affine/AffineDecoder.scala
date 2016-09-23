/**
  * Created by Alkit on 9/7/2016.
  */
package Affine

class AffineDecoder(a: Int, b: Int, alphabetLength: Int) {
  def decode(message: String) = {
    val codedMessage = message.map(x => x.toInt - 65)
      .map(x => (a * (x - b)) % alphabetLength)
      .map(x => (x + 65).toChar)
    codedMessage.mkString
  }
}
