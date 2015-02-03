//Selection Sort
// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos
class SelectionSort(){
	def Selection(A: Array[Int]) = {
		var (minimo, aux) = (0,0)
		for( i <- 0 to (A.length - 2)) {
			minimo = i
			for( j <- (i + 1) to (A.length - 1)) {
				if(A(j) < A(minimo)){
					minimo = j
				}
			}
			aux = A(i)
			A(i) = A(minimo)
			A(minimo) = aux
		}		
	}
}
