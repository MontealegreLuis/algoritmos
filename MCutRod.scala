//Tarea de Analisis y diseño de Algoritmos
//Gerardo Flores Petlacalco
//201124783
import scala.math;

class MCutRod{
	def MemoCutR(P: Array[Int], n: Int):Int = {
		val R = new Array[Int](n+1)
		for( i <- 0 to n) {
			R(i) = -342341
		}
		return MCutRodAux(P,n,R);
	}

	def MCutRodAux(P: Array[Int], n: Int, R:Array[Int]):Int = {
		if(R(n) >= 0)
			return R(n)

		var q = 0

		if(n == 0)
			q = 0
		else{
			q = -32454
			for( i <- 1 to n) {
				q = math.max(q, P(i) + MCutRodAux(P, n-i, R))
			}
		}

		R(n) = q
		return q
	}
}