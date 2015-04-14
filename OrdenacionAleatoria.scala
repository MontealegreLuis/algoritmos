package ordenacion_y_contratacion_aleatoria

import scala.util.Random

object OrdenacionAleatoria {

	def main(args: Array[String]) {
		var mArray = Array(11, 25, 13, 2, 7, 6, 5, 12, 13, 30, 32, 31, 33)
		var mPotencias = Array.ofDim[Int](mArray.length)
		var mRandom = new Random()
		
		
		// Creamos nuestro arreglo de x^3 al azar
		for (i <- 0 to mArray.length - 1) {
			mPotencias(i) = mRandom.nextInt(
					mArray.length * mArray.length * mArray.length) + 1
		}
					
		// Mostramos el arreglo original
		println("Arreglo original:\n" + mArray.mkString(", "))
		
		// Mostramos el arreglo de potencias
		println("\nArreglo de potencias:\n" + mPotencias.mkString(", "))

		// "Ordenamos"
		ContratacionOrdenacionUTILS.ordenar(mArray, mPotencias)
		
		// Mostramos el arreglo ordenado
		println("\nArreglo ordenado:\n" + mArray.mkString(", "))
	}
}