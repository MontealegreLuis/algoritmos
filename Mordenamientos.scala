//
// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos

import scala.util.Random;
import scala.math;
class Mordenamientos{
	def PermuteBySorting(A: Array[Int])={
		//println("\n Generacion del arreglo aleatorio \n")
		var v =math.pow(A.length, 3)
		val r = new Random()
		var L = new Array[Int](A.length)

		for( i <- 0 to A.length-1) {
			L(i) = r.nextInt(v.toInt)
		}
		/*for( i <- 0 to A.length-1){
			println(L(i)+" "+A(i))
		}*/
		Sort(L,A)
	}

	def Sort(A: Array[Int], P: Array[Int]) = {

		//println("\n El Array ordenado es:\n")

		var (minimo, aux, aux2) = (0,0,0)
		for( i <- 0 to (A.length - 2)) {
			minimo = i
			for( j <- (i + 1) to (A.length - 1)) {
				if(A(j) < A(minimo)){
					minimo = j
				}
			}
			aux = A(i)
			aux2 = P(i) 
			A(i) = A(minimo)
			P(i) = P(minimo)
			A(minimo) = aux
			P(minimo) = aux2
		}

		/*for( i <- 0 to A.length-1) {
			println(A(i)+" "+P(i))
		}*/
	}

	def Inplace(A: Array[Int])={
		val r = new Random()
		var (pos,aux) = (0,0)

		for( i <- 0 to A.length-1) {
			pos = r.nextInt(A.length-1)
			aux = A(pos)
			A(pos) = A(i)
			A(i) = aux
		}
	}
}