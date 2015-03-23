package ordenacion_y_contratacion_aleatoria

import scala.util.Random

object ContratacionAleatorio {

	def main(args: Array[String]) {
		var mArray = Array(3, 6, 9, 2, 5, 8, 1, 4, 7, 0)
		var mPotencias = Array.ofDim[Int](mArray.length)
		var mRandom = new Random()

		// Creamos nuestro arreglo de x^3 al azar
		for (i <- 0 to mArray.length - 1) {
			mPotencias(i) = mRandom.nextInt(
					mArray.length * mArray.length * mArray.length) + 1
		}
		
		// Mostramos el arreglo original 
		println("Orden original de los entrevistados:\n" + mArray.mkString(", "))
		
		// Mostramos el arreglo de potencias
		println("\nArreglo de potencias:\n" + mPotencias.mkString(", "))

		// "Ordenamos"
		ContratacionOrdenacionUTILS.ordenar(mArray, mPotencias)

		// Mostramos el arreglo ordenado
		println("\nArreglo ordenado:\n" + mArray.mkString(", "))

		// Mostramos el total de contratados
		println("\nEmpezemos a contratar:\n")
		println("\nTotal contratados: " + 
							ContratacionOrdenacionUTILS.contratarPersonal(mArray))
	}
}