// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos

class hireassistant{
	def seleccionarinplace(A: Array[Int]) = {
		val B = new Mordenamientos()
		B.Inplace(A)
		var Best = 0
		for( i <- 0 to A.length-1) {
			println("Entrevistando al candidato: " + i)
			if(A(i)>Best){
				Best = A(i)
				println("El candidato: " + i + " es mejor que el anterior, lo hemos contratado ranking del mejor: "+A(i))
			}
		}
	}

	def seleccionarPermute(A: Array[Int]) = {
		val B = new Mordenamientos()
		B.PermuteBySorting(A)
		var Best = 0
		for( i <- 0 to A.length-1) {
			println("Entrevistando al candidato: " + i)
			if(A(i)>Best){
				Best = A(i)
				println("El candidato: " + i + " es mejor que el anterior, lo hemos contratado ranking del mejor: "+A(i))
			}
		}
	}
}