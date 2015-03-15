package selection_sort

object SelectionSort {
	def main(args: Array[String]) {
		val mArray = Array(11, 25, 13, 2, 7, 6, 5, 12, 13, 30, 32, 31, 33)

		// Mostramos arreglo inicial
		println("Arreglo original desordenado:\n" + 
						mArray.mkString(", ") + 
						"\n")
		
		// Llamamos a nuestro método de ordenamiento
		OrdenarArray(mArray);
		
		
		// Imprimimos
		println("El arreglo ordenado es:\n" + mArray.mkString(", "))
	}

	
	def OrdenarArray(A: Array[Int]) {
		var min = 0
		var temp = 0
	
		for (i <- 0 until (A.length - 1)) {
			min = i
			for (j <- (i + 1) until (A.length)) {
				if (A(j) < A(min)) {
					min = j
				}
			}
			temp = A(i)
			A(i) = A(min)
			A(min) = temp
		}
	}	
}


