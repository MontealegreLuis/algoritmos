import scala.util.Random;
import scala.math;
class Randomize{
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

object mainRando{
	def main(args: Array[String]): Unit = {
	    val A = Array(10,9,8,7,6,5,4,3,2,1,0);
            var ra = new Randomize()
            ra.Inplace(A)
	}
}