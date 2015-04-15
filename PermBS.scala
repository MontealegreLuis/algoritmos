import scala.util.Random;
import scala.math;
class PermBS{
	def Pbs(A: Array[Int])={
		var v =math.pow(A.length, 3)
		val r = new Random()
		var X = new Array[Int](A.length)

		for( i <- 0 to A.length-1) {
			X(i) = r.nextInt(v.toInt)
		}

		Sort(X,A)
	}

	def Sort(A: Array[Int], P: Array[Int]) = {
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

	}

	def Inp(A: Array[Int])={
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
