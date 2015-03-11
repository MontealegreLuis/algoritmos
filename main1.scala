// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos

object main{
	def main(args: Array[String]): Unit = {
	    val A = Array(10,9,8,7,6,5,4,3,2,1,0)
	    val A1 = Array(10,9,8,7,6,5,4,3,2,1,0)
		val H = new hireassistant()

		println("\n\nSeleccion por Inplace\n\n")

		H.seleccionarinplace(A)

		println("\n\nSeleccion por permutacion\n\n")

		H.seleccionarPermute(A1)
	}	
 }