package cut_rod

import scala.Array._
import cut_rod.CutRodUTILS._
import cut_rod.CutRodUTILS.TIPO_DE_EJECUCION_CUT_ROD._


object Memorized_Cut_Rod {
	var p = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

	def main(args: Array[String]) {
		var mPipe = 7
		
		mostrarEjecucionDeUnProgramaMainDeCutRod(MEMORIZED_CUT_ROD, mPipe, p)
	}

	
	
	/**
	 * Algoritmo de "Memorized_Cut_Rod" Visto durante la clase
	 */
	def memorizedCutRodAlgorithm(n: Int): Int = {
		var r = Array.ofDim[Int](n + 1)

		for (i <- 0 to n) {
			r(i) = Int.MinValue
		}

		return memorizedCutRodAux(n, r)
	}

	def memorizedCutRodAux(n: Int, r: Array[Int]): Int = {
		if (r(n) >= 0)
			return r(n)
		if (n == 0)
			return 0
			
		var q = Int.MinValue

		for (i <- 0 until n) {
			q = math.max(q, p(i) + memorizedCutRodAux(n - i - 1, r))
		}

		r(n) = q
		return q
	}
}