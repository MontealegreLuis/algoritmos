//Tarea de Analisis y diseño de Algoritmos
//Gerardo Flores Petlacalco
//201124783

import scala.math;

class BUpCutRod{
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
}