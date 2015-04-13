/**
 * Created by Clarissa on 12/04/2015.
 */
object BottonUpCutRod{
  	def ButtonUpCutRod(P: Array[Int], n : Int):Int = {
    		val R = new Array[Int](n+1)
      	R(0) = 0
    		var q = 0
    		for( j <- 1 to n) {
    		    q = -242134
    		    for( i <- 1 to j) {
    				    q = math.max(q, P(i) + R(j - i))
        		}
            R(j) = q
        }
        return R(n);
    }


    def main(args: Array[String]): Unit = {
    		val A2 = Array(0,1,5,8,9,10,17,17,20,24,30)
        var n=10
       	println("La ganancia maxima para un tubo de "+n+" es "+ ButtonUpCutRod(A2,n))
    	}
  }
