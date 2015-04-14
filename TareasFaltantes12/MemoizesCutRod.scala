/**
 * Created by Clarissa on 12/04/2015.
 */

import scala.math;
object MemoizesCutRod{
     def MemoizesCutRod(P: Array[Int], n: Int):Int = {
        	val R = new Array[Int](n+1)
          for( i <- 0 to n) {
          		R(i) = -342341
          }
        	return MemoizesCutRodAux(P,n,R);
     }

     def MemoizesCutRodAux(P: Array[Int], n: Int, R:Array[Int]):Int = {
      		if(R(n) >= 0)
    			return R(n)
          var q = 0
      		if(n == 0)
        			q = 0
          else{
          		q = -32454
        			for( i <- 1 to n) {
        			    q = math.max(q, P(i) + MemoizesCutRodAux(P, n-i, R))
          		}
      		}
          R(n) = q
      	  return q
     }

     def main(args: Array[String]): Unit = {
        	val A2 = Array(0,1,5,8,9,10,17,17,20,24,30);
          var n = 4
       		println("La ganancia maxima para un tubo de "+ n+ " es "+ MemoizesCutRod(A2,n))
    }
}
