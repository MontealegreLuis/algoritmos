import scala.util.Random

object PermuteBySort2
{
	def main(args: Array[String]) 
	{
		var A = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
		for(i <- 0 to A.length - 1)
		{
			println("NumO: " + A(i))
		}
		Permute(A)
		for(i <- 0 to A.length - 1)
		{
			println("Num: " + A(i))
		}
	}

	def Permute(A:Array[Int])
	{
		var rndInt = new Random

		for(i <- 0 to A.length - 1)
		{
			var na = rndInt.nextInt((A.length - 1))
			var np = 0
			if ((i + na) < A.length - 1) np = (i + na)
			else np = na
			var aux = A(i)
			A(i) = A(np)
			A(np) = aux
		}
	}
}