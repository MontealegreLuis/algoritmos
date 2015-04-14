package cut_rod

import scala.Array._
import cut_rod.CutRodUTILS._
import cut_rod.CutRodUTILS.TIPO_DE_EJECUCION_CUT_ROD._


object Bottom_Up_Cut_Rod {
	var p = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

	def main(args: Array[String]) {
		var mPipe = 5
		
		mostrarEjecucionDeUnProgramaMainDeCutRod(BOTTOM_UP_CUT_ROD, mPipe, p)
	}
	
	

	/**
	 * Algoritmo de "Bottom_Up_Cut_Rod" Visto durante la clase
	 */
	def bottomUpCutRodAlgorithm(n: Int): Int = {
		var r = Array.ofDim[Int](n + 1)
		r(0) = 0
		for (j <- 0 until n) {
			var q = Int.MinValue
			for (i <- 0 to j) {
				q = math.max(q, p(i) + r(j - i))
			}
			r(j + 1) = q
		}
		return r(n)
	}
}