import scala.math;
class CutRod1{
  def Cutrod1(P: Array[Int], n: Int):Int ={
    if(n == 0)
      return 0

    var q = -999999

    for( i <- 1 to n) {
      q = math.max(q, P(i) + Cutrod1(P, n-i))
    }
    return q
  }

}
