val string = "ATTACK AT DOWN"
string.map(x => x.toInt - 65)
val vector2 = string.map(x => (3*(x.toInt - 65) + 4)%26)
  .filter(x => x >= 0)
  .map(x => (x + 65).toChar)

val s = vector2.mkString

val vector3 = s
    .map(x => x.toInt - 65)
  .map(x => (Math.pow(3,-1) * (x - 4))% 26)

val s1 = vector2.mkString

val (x,y,z) = (1,2,3)
