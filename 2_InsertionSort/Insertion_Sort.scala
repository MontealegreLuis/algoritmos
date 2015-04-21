object InsertionSort{
	def sort(A: Array[Int], asc: Boolean){
		var key = 0
		var i = 0
			for (j <- 0 to A.length - 1) {
				key = A(j)
				i = j - 1
				while (i >= 0 && compare(A(i), key, asc)) {
					A(i + 1) = A(i)
					i = i - 1
				}
			A(i + 1) = key
			}
		Imprime(A)
	}

	def Imprime(A:Array[Int]){
		for(i<-0 to A.length-1)
			print(" "+A(i))
		println("")	
	}
	def compare(a: Int, b: Int, asc: Boolean): Boolean = {
		if (true == asc) {
			return a > b
		}
		return a <= b
	}
	def main(args:Array [String]){
		var A=Array(10,9,8,7,6,5,4,3,2,1)
		println("\n\nOrdenamiento por Inserción \n\nArreglo Inicial: ")			
		Imprime(A)	
		println("\nArreglo Ordenado: ")			
		sort(A,true)	
		println("")
		
	}
}


