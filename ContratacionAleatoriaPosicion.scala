package ordenacion_y_contratacion_aleatoria

object ContratacionAleatoriaPosicion {
	def main(args: Array[String]) {

		var mArray = Array(3, 6, 9, 2, 5, 8, 1, 4, 7, 0)

		// Mostramos el arreglo original 
		println("Orden original de los entrevistados:\n" + mArray.mkString(", "))
		
		// "Ordenamos"
		ContratacionOrdenacionUTILS.ordPosicion(mArray)

		// Mostramos el arreglo ordenado
		println("\nArreglo ordenado:\n" + mArray.mkString(", "))

		// Mostramos el total de contratados
		println("\nEmpezemos a contratar:\n")
		println("\nTotal contratados: " + 
							ContratacionOrdenacionUTILS.contratarPersonal(mArray))
	}
}