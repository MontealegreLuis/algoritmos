import scala.util.Random

object PermuteBySort
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
		var Aux = new Array[DoubleInt](A.length)
		var rndInt = new Random
		var pa = (Math.pow(A.length, 3)).floor.toInt

		for(i <- 0 to A.length - 1)
		{
			var di = new DoubleInt
			di.a = A(i)
			di.b = rndInt.nextInt(pa)
			Aux(i) = di
		}

		var tem = 0
		var tem2 = 0
		for(i <- 0 to Aux.length - 1)
		{
			tem = i
			for(j <- (i+1) to Aux.length - 1)
			{
				if(Aux(j).b < Aux(tem).b)
				{
					tem = j
				}
			}
			tem2 = Aux(i).a
			A(i) = Aux(tem).a
			A(tem) = tem2

			var temDi = Aux(i)
			Aux(i) = Aux(tem)
			Aux(tem) = temDi
		}
	}
}

class DoubleInt
{
	var a = 0
	var b = 0
}