//Metodo de ordenamiento "MergeSort"
// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos

class MergeSort(){
	def Merge(A: Array[Int], p: Int, r: Int) :Unit = {//Para hacer la recursion, debi poner :Unit depues de los argumentos, sino me marcaba error al compilar
		if(p < r){
			val q = ((p + r)/2)
			Merge(A, p, q)
			Merge(A, q + 1, r)
			println(p + " " + q + " " + r + " Sort")
			Sort(A,p,q,r)
		}
	}

	def Sort(A: Array[Int], p: Int, q: Int, r: Int) = {
		var (i,j,k) = (0,0,0)
		val n1 = (q - p) + 1
		val n2 = r - q

		var L = new Array[Int](n1 + 1)
		var R = new Array[Int](n2 + 1)

		for( i <- 1 to n1) {				//En esta parte tuve problemas, ya que si lo ponia como en el algoritmo, me marcaba una violacion de segmento
			L(i-1) = A((p + i) - 1)
		}

		for( j <- 1 to n2) {
			R(j-1) = A(q + j)
		}

		L(n1) = 12345
		R(n2) = 12345

		i = 0
		j = 0

		for( k <- p to r) {
			if(L(i) <= R(j)){
				A(k) = L(i)
				i = i + 1
			}
			else{
				A(k) = R(j)
				j = j + 1
			}
		}
	}
	
}