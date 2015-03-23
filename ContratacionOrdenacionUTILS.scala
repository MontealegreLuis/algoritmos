package ordenacion_y_contratacion_aleatoria

import scala.util.Random

object ContratacionOrdenacionUTILS {

	def ordenar(mArray: Array[Int], mPotencias: Array[Int]) {
		var tam = mPotencias.length;

		for (i <- 0 until tam - 1) {
			var min = i;
			for (j <- i + 1 until tam) {
				if (mPotencias(j) < mPotencias(min))
					min = j
			}

			if (i != min) {
				var aux = mArray(i)
				var cam = mPotencias(i)
				mArray(i) = mArray(min)
				mPotencias(i) = mPotencias(min)
				mArray(min) = aux
				mPotencias(min) = cam
			}
		}
	}

	def ordPosicion(mArray: Array[Int]) {
		var tam = mArray.length;
		var mRandom = new Random()

		// "Ordenamos"
		for (i <- 0 until tam) {
			var ran = mRandom.nextInt(tam - i) + i

			// Intercambiamos los valores
			var temp = mArray(i)
			mArray(i) = mArray(ran)
			mArray(ran) = temp
		}
	}

	def contratarPersonal(mArray: Array[Int]): Int = {
		var res = 0
		var bueno = 0
		
		// Hacemos una representación de código de como se realizaría la contratación
		for (i <- 0 until mArray.length) {
			println("\tEntrevistando a #" + mArray(i))
			if (mArray(i) > bueno) {
				bueno = mArray(i)
				res = res + 1
				println("\t\tCONTRATADO! #" + mArray(i))
			}
		}
		return res
	}
}