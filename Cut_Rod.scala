package cut_rod

import scala.Array._
import cut_rod.CutRodUTILS._
import cut_rod.CutRodUTILS.TIPO_DE_EJECUCION_CUT_ROD._


object Cut_Rod {
	var p = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

	def main(args: Array[String]) {
		var mPipe = 6
		
		mostrarEjecucionDeUnProgramaMainDeCutRod(CUT_ROD, mPipe, p)
	}
	
	

	/**
	 * Algoritmo de "Cut_Rod" Visto durante la clase
	 */
	def cutRodAlgorithm(n: Int): Int = {
		if (n == 0)
			return 0

		var q = Int.MinValue
		for (i <- 0 until n) q = math.max(q, p(i) + cutRodAlgorithm(n - 1 - i))
		return q
	}
}