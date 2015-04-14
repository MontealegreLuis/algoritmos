//Tarea de Analisis y diseño de Algoritmos
//Gerardo Flores Petlacalco
//201124783

class ExtCutRod{
	def ExtendendBottonUpCutRod(P: Array[Int],n: Int): Array[Int]= {
		val R = new Array[Int](n+1)
		val S = new Array[Int](n+1)

		R(0) = 0
		var q = 0

		for( j <- 1 to n) {
			q = -324325
			for( i <- 1 to j) {
					if(q < (P(i) + R(j - i))){
						q = P(i) + R(j - i)
						S(j) = i
					}
				}
			R(j) = q	
		}
		return S
	}

	def PrintCutRodSolution(P: Array[Int], n: Int) = {
		val S = ExtendendBottonUpCutRod(P,n)
		var n1 = n

		while(n1 > 0){
			println(S(n1))
			n1 = n1 - S(n1)
		}
	}
}