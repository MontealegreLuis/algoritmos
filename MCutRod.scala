import scala.math;

class MemoizedCR2{
  def MCR2(P: Array[Int], n: Int):Int = {
    val R = new Array[Int](n+1)
    for( i <- 0 to n) {
      R(i) = -342341
    }
    return MCRA(P,n,R);
  }

  def MCRA(P: Array[Int], n: Int, R:Array[Int]):Int = {
    if(R(n) >= 0)
      return R(n)

    var q = 0

    if(n == 0)
      q = 0
    else{
      q = -99999
      for( i <- 1 to n) {
        q = math.max(q, P(i) + MCRA(P, n-i, R))
      }
    }

    R(n) = q
    return q
  }
}
