import scala.annotation.tailrec

/**
  * Created by Alkit on 9/12/2016.
  */
class GCD {

  def modInv(a: Int, m: Int, x:Int = 1, y:Int = 0) : Int = if (m == 0) x else modInv(m, a%m, y, x - y*(a/m))

}
