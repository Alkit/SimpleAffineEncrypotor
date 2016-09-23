/**
  * Created by Alkit on 9/7/2016.
  */
package Affine

class AffineCoder(a: Int, b: Int, alphabetLength: Int) {
  def encode(message: String) = {
    val codedMessage = message.toUpperCase.map(x => x.toInt - 65)
      .filter(x => x >= 0)
      .map(x => (a * x + b) % alphabetLength)
      .map(x => (x + 65).toChar)
    codedMessage.mkString
  }
}
