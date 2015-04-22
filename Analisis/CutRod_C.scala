
import scala.math;

object CutRod_C
{

	def CutRodAlgoritmo(p: Array[Int], n: Int):Int ={

	    if(n==0)

		return 0

	    var q = -99999	

	    for(i<-1 to n) {

		q = math.max(q, p(i-1) + CutRodAlgoritmo(p, n-i))

	    }

		return q	

	}

	def main(args: Array[String]){

             val A = Array(1,9,15,4,3,0,7,14)

    	     println(CutRodAlgoritmo(A,4))

        }
	
}