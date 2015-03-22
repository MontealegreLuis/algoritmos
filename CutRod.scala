import scala.math;
class CutRod{
	def Cutrod(P: Array[Int], n: Int):Int ={
		if(n == 0)
			return 0

		var q = -2341354

		for( i <- 1 to n) {
			q = math.max(q, P(i) + Cutrod(P, n-i))
		}
		return q		
	}
	
}