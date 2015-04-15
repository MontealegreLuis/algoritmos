import scala.util.Random;
import scala.math;
class RandA{
	def InpA(A: Array[Int])={
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
