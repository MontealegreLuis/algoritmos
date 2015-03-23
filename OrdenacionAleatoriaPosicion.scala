package ordenacion_y_contratacion_aleatoria

import scala.util.Random

object OrdenacionAleatoriaPosicion {

	def main(args: Array[String]) {
		var mArray = Array(11, 25, 13, 2, 7, 6, 5, 12, 13, 30, 32, 31, 33)

		// Mostramos el arreglo original
		println("Arreglo original:\n" + mArray.mkString(", "))

		// Ordenamos en posicion
		ContratacionOrdenacionUTILS.ordPosicion(mArray)
		
		// Mostramos el arreglo ordenado
		println("\nArreglo ordenado:\n" + mArray.mkString(", "))
	}
}